package com.example.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserborrowExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public UserborrowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.USERBORROW
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
     * This method corresponds to the database table USER_INFO.USERBORROW
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
     * This method corresponds to the database table USER_INFO.USERBORROW
     *
     * @mbggenerated Sat Apr 20 17:01:18 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_INFO.USERBORROW
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
     * This class corresponds to the database table USER_INFO.USERBORROW
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

        public Criteria andUsersidIsNull() {
            addCriterion("USERSID is null");
            return (Criteria) this;
        }

        public Criteria andUsersidIsNotNull() {
            addCriterion("USERSID is not null");
            return (Criteria) this;
        }

        public Criteria andUsersidEqualTo(Long value) {
            addCriterion("USERSID =", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotEqualTo(Long value) {
            addCriterion("USERSID <>", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidGreaterThan(Long value) {
            addCriterion("USERSID >", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidGreaterThanOrEqualTo(Long value) {
            addCriterion("USERSID >=", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidLessThan(Long value) {
            addCriterion("USERSID <", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidLessThanOrEqualTo(Long value) {
            addCriterion("USERSID <=", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidIn(List<Long> values) {
            addCriterion("USERSID in", values, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotIn(List<Long> values) {
            addCriterion("USERSID not in", values, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidBetween(Long value1, Long value2) {
            addCriterion("USERSID between", value1, value2, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotBetween(Long value1, Long value2) {
            addCriterion("USERSID not between", value1, value2, "usersid");
            return (Criteria) this;
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USER_INFO.USERBORROW
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
     * This class corresponds to the database table USER_INFO.USERBORROW
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