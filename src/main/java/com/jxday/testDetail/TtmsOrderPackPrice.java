package com.jxday.testDetail;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class TtmsOrderPackPrice implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 承运商id
     */
    private String groupUid;
    /**
     * 承运商名称
     */
    private String groupName;
    /**
     * 司机姓名
     */
    private String username;
    /**
     * 司机电话
     */
    private String phoneNumber;
    /**
     * 车牌号
     */
    private String carNumber;

    /**
     * 费用
     */
    private BigDecimal price;
    /**
     * 已支付费用
     */
    private BigDecimal freightPay;
    /**
     * 签约时间
     */
    private Integer signTime;
    /**
     * 组织机构
     */
    private String organizationPath;
    /**
     * 组织机构中文名称
     */
    private String organizationName;

    /**
     * 银行支付
     */
    private BigDecimal bankPrice;
    /**
     * ETC支付
     */
    private BigDecimal etcPrice;
    /**
     * 油卡支付
     */
    private BigDecimal oilPrice;


    /**
     * 修改后费用
     */
    private BigDecimal changePrice;
    private String province;
    private String company;

    @JsonIgnore
    private int count;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TtmsOrderPackPrice that = (TtmsOrderPackPrice) o;

//        if (count != that.count) return false;
//        if (groupUid != null ? !groupUid.equals(that.groupUid) : that.groupUid != null) return false;
        if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null) return false;
//        if (username != null ? !username.equals(that.username) : that.username != null) return false;
//        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
//        if (carNumber != null ? !carNumber.equals(that.carNumber) : that.carNumber != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (changePrice != null ? !changePrice.equals(that.changePrice) : that.changePrice != null) return false;
//        if (freightPay != null ? !freightPay.equals(that.freightPay) : that.freightPay != null) return false;
        if (signTime != null ? !signTime.equals(that.signTime) : that.signTime != null) return false;
        if (organizationPath != null ? !organizationPath.equals(that.organizationPath) : that.organizationPath != null) {
            return false;
        }
        if (organizationName != null ? !organizationName.equals(that.organizationName) : that.organizationName != null) {
            return false;
        }
//        if (bankPrice != null ? !bankPrice.equals(that.bankPrice) : that.bankPrice != null) return false;
//        if (etcPrice != null ? !etcPrice.equals(that.etcPrice) : that.etcPrice != null) return false;
//        if (oilPrice != null ? !oilPrice.equals(that.oilPrice) : that.oilPrice != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        return company != null ? company.equals(that.company) : that.company == null;

    }

    @Override
    public int hashCode() {
        int result = groupUid != null ? groupUid.hashCode() : 0;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (carNumber != null ? carNumber.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (freightPay != null ? freightPay.hashCode() : 0);
        result = 31 * result + (signTime != null ? signTime.hashCode() : 0);
        result = 31 * result + (organizationPath != null ? organizationPath.hashCode() : 0);
        result = 31 * result + (organizationName != null ? organizationName.hashCode() : 0);
        result = 31 * result + (bankPrice != null ? bankPrice.hashCode() : 0);
        result = 31 * result + (etcPrice != null ? etcPrice.hashCode() : 0);
        result = 31 * result + (oilPrice != null ? oilPrice.hashCode() : 0);
        result = 31 * result + (changePrice != null ? changePrice.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + count;
        return result;
    }

    public class TtmsOrderPackPriceSon extends TtmsOrderPackPrice implements Comparable<TtmsOrderPackPriceSon>{
        /**
         * Compares this object with the specified object for order.  Returns a
         * negative integer, zero, or a positive integer as this object is less
         * than, equal to, or greater than the specified object.
         *
         * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
         * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
         * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
         * <tt>y.compareTo(x)</tt> throws an exception.)
         *
         * <p>The implementor must also ensure that the relation is transitive:
         * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
         * <tt>x.compareTo(z)&gt;0</tt>.
         *
         * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
         * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
         * all <tt>z</tt>.
         *
         * <p>It is strongly recommended, but <i>not</i> strictly required that
         * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
         * class that implements the <tt>Comparable</tt> interface and violates
         * this condition should clearly indicate this fact.  The recommended
         * language is "Note: this class has a natural ordering that is
         * inconsistent with equals."
         *
         * <p>In the foregoing description, the notation
         * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
         * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
         * <tt>0</tt>, or <tt>1</tt> according to whether the value of
         * <i>expression</i> is negative, zero or positive.
         *
         * @param o the object to be compared.
         * @return a negative integer, zero, or a positive integer as this object
         * is less than, equal to, or greater than the specified object.
         * @throws NullPointerException if the specified object is null
         * @throws ClassCastException   if the specified object's type prevents it
         *                              from being compared to this object.
         */
        @Override
        public int compareTo(TtmsOrderPackPriceSon o) {
            return 0;
        }
    }
}
