package com.jxday.testDetail;

import java.io.Serializable;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * 〈生产者/消费者模式，aqs实现〉
 *
 * @author cty
 * @ClassName test20200713
 * @create 2020-07-13 15:20
 * @Version 1.0.0
 */
public class test20200713 implements Lock, Serializable {

    private final Sync sync = new Sync();

    
    private static class Sync extends AbstractQueuedSynchronizer {
        //当前线程是否是独占

        protected boolean isHeldExclusively(){
            return getState() == 1;
        }

        protected boolean tryAcquire(int arg){
            assert arg == 1;
            if (getState() == 0){
                if (compareAndSetState(0,1)){
                    setExclusiveOwnerThread(Thread.currentThread());
                    return true;
                }
            }
            return false;
        }

        protected boolean tryRelease(int arg) {
            assert arg == 0;
//            if (getState() == 1){
//                if (compareAndSetState(1,0)){
//                    setExclusiveOwnerThread(null);
//                    return true;
//                }  
//            }
//            return false; 
            if (getState() == 0){
                throw new UnsupportedOperationException();
            }
            setExclusiveOwnerThread(null);
            setState(1);
            return true;
        }
        Condition newCondition(){
            return new ConditionObject();
        }
    }


    public void lock() {
        sync.tryAcquire(1);
    }
    
    public boolean isLocked(){
        return sync.isHeldExclusively();
    }

    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }

    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireNanos(1,unit.toNanos(time));
    }

    public void unlock() {
        sync.tryRelease(0);
    }

    public Condition newCondition() {
        return sync.newCondition();
    }
}
