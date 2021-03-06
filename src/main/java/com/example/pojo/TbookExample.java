package com.example.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbookExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public TbookExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBooksisbnIsNull() {
            addCriterion("BOOKSISBN is null");
            return (Criteria) this;
        }

        public Criteria andBooksisbnIsNotNull() {
            addCriterion("BOOKSISBN is not null");
            return (Criteria) this;
        }

        public Criteria andBooksisbnEqualTo(Long value) {
            addCriterion("BOOKSISBN =", value, "booksisbn");
            return (Criteria) this;
        }

        public Criteria andBooksisbnNotEqualTo(Long value) {
            addCriterion("BOOKSISBN <>", value, "booksisbn");
            return (Criteria) this;
        }

        public Criteria andBooksisbnGreaterThan(Long value) {
            addCriterion("BOOKSISBN >", value, "booksisbn");
            return (Criteria) this;
        }

        public Criteria andBooksisbnGreaterThanOrEqualTo(Long value) {
            addCriterion("BOOKSISBN >=", value, "booksisbn");
            return (Criteria) this;
        }

        public Criteria andBooksisbnLessThan(Long value) {
            addCriterion("BOOKSISBN <", value, "booksisbn");
            return (Criteria) this;
        }

        public Criteria andBooksisbnLessThanOrEqualTo(Long value) {
            addCriterion("BOOKSISBN <=", value, "booksisbn");
            return (Criteria) this;
        }

        public Criteria andBooksisbnIn(List<Long> values) {
            addCriterion("BOOKSISBN in", values, "booksisbn");
            return (Criteria) this;
        }

        public Criteria andBooksisbnNotIn(List<Long> values) {
            addCriterion("BOOKSISBN not in", values, "booksisbn");
            return (Criteria) this;
        }

        public Criteria andBooksisbnBetween(Long value1, Long value2) {
            addCriterion("BOOKSISBN between", value1, value2, "booksisbn");
            return (Criteria) this;
        }

        public Criteria andBooksisbnNotBetween(Long value1, Long value2) {
            addCriterion("BOOKSISBN not between", value1, value2, "booksisbn");
            return (Criteria) this;
        }

        public Criteria andBooksnameIsNull() {
            addCriterion("BOOKSNAME is null");
            return (Criteria) this;
        }

        public Criteria andBooksnameIsNotNull() {
            addCriterion("BOOKSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBooksnameEqualTo(String value) {
            addCriterion("BOOKSNAME =", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameNotEqualTo(String value) {
            addCriterion("BOOKSNAME <>", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameGreaterThan(String value) {
            addCriterion("BOOKSNAME >", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKSNAME >=", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameLessThan(String value) {
            addCriterion("BOOKSNAME <", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameLessThanOrEqualTo(String value) {
            addCriterion("BOOKSNAME <=", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameLike(String value) {
            addCriterion("BOOKSNAME like", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameNotLike(String value) {
            addCriterion("BOOKSNAME not like", value, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameIn(List<String> values) {
            addCriterion("BOOKSNAME in", values, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameNotIn(List<String> values) {
            addCriterion("BOOKSNAME not in", values, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameBetween(String value1, String value2) {
            addCriterion("BOOKSNAME between", value1, value2, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksnameNotBetween(String value1, String value2) {
            addCriterion("BOOKSNAME not between", value1, value2, "booksname");
            return (Criteria) this;
        }

        public Criteria andBooksauthorIsNull() {
            addCriterion("BOOKSAUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andBooksauthorIsNotNull() {
            addCriterion("BOOKSAUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andBooksauthorEqualTo(String value) {
            addCriterion("BOOKSAUTHOR =", value, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorNotEqualTo(String value) {
            addCriterion("BOOKSAUTHOR <>", value, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorGreaterThan(String value) {
            addCriterion("BOOKSAUTHOR >", value, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKSAUTHOR >=", value, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorLessThan(String value) {
            addCriterion("BOOKSAUTHOR <", value, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorLessThanOrEqualTo(String value) {
            addCriterion("BOOKSAUTHOR <=", value, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorLike(String value) {
            addCriterion("BOOKSAUTHOR like", value, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorNotLike(String value) {
            addCriterion("BOOKSAUTHOR not like", value, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorIn(List<String> values) {
            addCriterion("BOOKSAUTHOR in", values, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorNotIn(List<String> values) {
            addCriterion("BOOKSAUTHOR not in", values, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorBetween(String value1, String value2) {
            addCriterion("BOOKSAUTHOR between", value1, value2, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBooksauthorNotBetween(String value1, String value2) {
            addCriterion("BOOKSAUTHOR not between", value1, value2, "booksauthor");
            return (Criteria) this;
        }

        public Criteria andBookstypeIsNull() {
            addCriterion("BOOKSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBookstypeIsNotNull() {
            addCriterion("BOOKSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBookstypeEqualTo(String value) {
            addCriterion("BOOKSTYPE =", value, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeNotEqualTo(String value) {
            addCriterion("BOOKSTYPE <>", value, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeGreaterThan(String value) {
            addCriterion("BOOKSTYPE >", value, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKSTYPE >=", value, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeLessThan(String value) {
            addCriterion("BOOKSTYPE <", value, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeLessThanOrEqualTo(String value) {
            addCriterion("BOOKSTYPE <=", value, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeLike(String value) {
            addCriterion("BOOKSTYPE like", value, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeNotLike(String value) {
            addCriterion("BOOKSTYPE not like", value, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeIn(List<String> values) {
            addCriterion("BOOKSTYPE in", values, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeNotIn(List<String> values) {
            addCriterion("BOOKSTYPE not in", values, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeBetween(String value1, String value2) {
            addCriterion("BOOKSTYPE between", value1, value2, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookstypeNotBetween(String value1, String value2) {
            addCriterion("BOOKSTYPE not between", value1, value2, "bookstype");
            return (Criteria) this;
        }

        public Criteria andBookspriceIsNull() {
            addCriterion("BOOKSPRICE is null");
            return (Criteria) this;
        }

        public Criteria andBookspriceIsNotNull() {
            addCriterion("BOOKSPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andBookspriceEqualTo(Long value) {
            addCriterion("BOOKSPRICE =", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceNotEqualTo(Long value) {
            addCriterion("BOOKSPRICE <>", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceGreaterThan(Long value) {
            addCriterion("BOOKSPRICE >", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceGreaterThanOrEqualTo(Long value) {
            addCriterion("BOOKSPRICE >=", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceLessThan(Long value) {
            addCriterion("BOOKSPRICE <", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceLessThanOrEqualTo(Long value) {
            addCriterion("BOOKSPRICE <=", value, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceIn(List<Long> values) {
            addCriterion("BOOKSPRICE in", values, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceNotIn(List<Long> values) {
            addCriterion("BOOKSPRICE not in", values, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceBetween(Long value1, Long value2) {
            addCriterion("BOOKSPRICE between", value1, value2, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspriceNotBetween(Long value1, Long value2) {
            addCriterion("BOOKSPRICE not between", value1, value2, "booksprice");
            return (Criteria) this;
        }

        public Criteria andBookspublisherIsNull() {
            addCriterion("BOOKSPUBLISHER is null");
            return (Criteria) this;
        }

        public Criteria andBookspublisherIsNotNull() {
            addCriterion("BOOKSPUBLISHER is not null");
            return (Criteria) this;
        }

        public Criteria andBookspublisherEqualTo(String value) {
            addCriterion("BOOKSPUBLISHER =", value, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherNotEqualTo(String value) {
            addCriterion("BOOKSPUBLISHER <>", value, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherGreaterThan(String value) {
            addCriterion("BOOKSPUBLISHER >", value, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKSPUBLISHER >=", value, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherLessThan(String value) {
            addCriterion("BOOKSPUBLISHER <", value, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherLessThanOrEqualTo(String value) {
            addCriterion("BOOKSPUBLISHER <=", value, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherLike(String value) {
            addCriterion("BOOKSPUBLISHER like", value, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherNotLike(String value) {
            addCriterion("BOOKSPUBLISHER not like", value, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherIn(List<String> values) {
            addCriterion("BOOKSPUBLISHER in", values, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherNotIn(List<String> values) {
            addCriterion("BOOKSPUBLISHER not in", values, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherBetween(String value1, String value2) {
            addCriterion("BOOKSPUBLISHER between", value1, value2, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBookspublisherNotBetween(String value1, String value2) {
            addCriterion("BOOKSPUBLISHER not between", value1, value2, "bookspublisher");
            return (Criteria) this;
        }

        public Criteria andBooksstoreIsNull() {
            addCriterion("BOOKSSTORE is null");
            return (Criteria) this;
        }

        public Criteria andBooksstoreIsNotNull() {
            addCriterion("BOOKSSTORE is not null");
            return (Criteria) this;
        }

        public Criteria andBooksstoreEqualTo(Long value) {
            addCriterion("BOOKSSTORE =", value, "booksstore");
            return (Criteria) this;
        }

        public Criteria andBooksstoreNotEqualTo(Long value) {
            addCriterion("BOOKSSTORE <>", value, "booksstore");
            return (Criteria) this;
        }

        public Criteria andBooksstoreGreaterThan(Long value) {
            addCriterion("BOOKSSTORE >", value, "booksstore");
            return (Criteria) this;
        }

        public Criteria andBooksstoreGreaterThanOrEqualTo(Long value) {
            addCriterion("BOOKSSTORE >=", value, "booksstore");
            return (Criteria) this;
        }

        public Criteria andBooksstoreLessThan(Long value) {
            addCriterion("BOOKSSTORE <", value, "booksstore");
            return (Criteria) this;
        }

        public Criteria andBooksstoreLessThanOrEqualTo(Long value) {
            addCriterion("BOOKSSTORE <=", value, "booksstore");
            return (Criteria) this;
        }

        public Criteria andBooksstoreIn(List<Long> values) {
            addCriterion("BOOKSSTORE in", values, "booksstore");
            return (Criteria) this;
        }

        public Criteria andBooksstoreNotIn(List<Long> values) {
            addCriterion("BOOKSSTORE not in", values, "booksstore");
            return (Criteria) this;
        }

        public Criteria andBooksstoreBetween(Long value1, Long value2) {
            addCriterion("BOOKSSTORE between", value1, value2, "booksstore");
            return (Criteria) this;
        }

        public Criteria andBooksstoreNotBetween(Long value1, Long value2) {
            addCriterion("BOOKSSTORE not between", value1, value2, "booksstore");
            return (Criteria) this;
        }

        public Criteria andBookstotalIsNull() {
            addCriterion("BOOKSTOTAL is null");
            return (Criteria) this;
        }

        public Criteria andBookstotalIsNotNull() {
            addCriterion("BOOKSTOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andBookstotalEqualTo(Long value) {
            addCriterion("BOOKSTOTAL =", value, "bookstotal");
            return (Criteria) this;
        }

        public Criteria andBookstotalNotEqualTo(Long value) {
            addCriterion("BOOKSTOTAL <>", value, "bookstotal");
            return (Criteria) this;
        }

        public Criteria andBookstotalGreaterThan(Long value) {
            addCriterion("BOOKSTOTAL >", value, "bookstotal");
            return (Criteria) this;
        }

        public Criteria andBookstotalGreaterThanOrEqualTo(Long value) {
            addCriterion("BOOKSTOTAL >=", value, "bookstotal");
            return (Criteria) this;
        }

        public Criteria andBookstotalLessThan(Long value) {
            addCriterion("BOOKSTOTAL <", value, "bookstotal");
            return (Criteria) this;
        }

        public Criteria andBookstotalLessThanOrEqualTo(Long value) {
            addCriterion("BOOKSTOTAL <=", value, "bookstotal");
            return (Criteria) this;
        }

        public Criteria andBookstotalIn(List<Long> values) {
            addCriterion("BOOKSTOTAL in", values, "bookstotal");
            return (Criteria) this;
        }

        public Criteria andBookstotalNotIn(List<Long> values) {
            addCriterion("BOOKSTOTAL not in", values, "bookstotal");
            return (Criteria) this;
        }

        public Criteria andBookstotalBetween(Long value1, Long value2) {
            addCriterion("BOOKSTOTAL between", value1, value2, "bookstotal");
            return (Criteria) this;
        }

        public Criteria andBookstotalNotBetween(Long value1, Long value2) {
            addCriterion("BOOKSTOTAL not between", value1, value2, "bookstotal");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated do_not_delete_during_merge Sat Apr 20 17:01:18 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_INFO.TBOOK
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}