package com.example.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class s_teacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public s_teacherExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherId is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Long value) {
            addCriterion("teacherId =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Long value) {
            addCriterion("teacherId <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Long value) {
            addCriterion("teacherId >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Long value) {
            addCriterion("teacherId >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Long value) {
            addCriterion("teacherId <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Long value) {
            addCriterion("teacherId <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Long> values) {
            addCriterion("teacherId in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Long> values) {
            addCriterion("teacherId not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Long value1, Long value2) {
            addCriterion("teacherId between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Long value1, Long value2) {
            addCriterion("teacherId not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("teacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("teacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("teacherName =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("teacherName <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("teacherName >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("teacherName >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("teacherName <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("teacherName <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("teacherName like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("teacherName not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("teacherName in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("teacherName not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("teacherName between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("teacherName not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridIsNull() {
            addCriterion("teacherUserId is null");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridIsNotNull() {
            addCriterion("teacherUserId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridEqualTo(Long value) {
            addCriterion("teacherUserId =", value, "teacheruserid");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridNotEqualTo(Long value) {
            addCriterion("teacherUserId <>", value, "teacheruserid");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridGreaterThan(Long value) {
            addCriterion("teacherUserId >", value, "teacheruserid");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridGreaterThanOrEqualTo(Long value) {
            addCriterion("teacherUserId >=", value, "teacheruserid");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridLessThan(Long value) {
            addCriterion("teacherUserId <", value, "teacheruserid");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridLessThanOrEqualTo(Long value) {
            addCriterion("teacherUserId <=", value, "teacheruserid");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridIn(List<Long> values) {
            addCriterion("teacherUserId in", values, "teacheruserid");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridNotIn(List<Long> values) {
            addCriterion("teacherUserId not in", values, "teacheruserid");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridBetween(Long value1, Long value2) {
            addCriterion("teacherUserId between", value1, value2, "teacheruserid");
            return (Criteria) this;
        }

        public Criteria andTeacheruseridNotBetween(Long value1, Long value2) {
            addCriterion("teacherUserId not between", value1, value2, "teacheruserid");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIsNull() {
            addCriterion("teacherPassword is null");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIsNotNull() {
            addCriterion("teacherPassword is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordEqualTo(String value) {
            addCriterion("teacherPassword =", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotEqualTo(String value) {
            addCriterion("teacherPassword <>", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordGreaterThan(String value) {
            addCriterion("teacherPassword >", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("teacherPassword >=", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLessThan(String value) {
            addCriterion("teacherPassword <", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLessThanOrEqualTo(String value) {
            addCriterion("teacherPassword <=", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLike(String value) {
            addCriterion("teacherPassword like", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotLike(String value) {
            addCriterion("teacherPassword not like", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIn(List<String> values) {
            addCriterion("teacherPassword in", values, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotIn(List<String> values) {
            addCriterion("teacherPassword not in", values, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordBetween(String value1, String value2) {
            addCriterion("teacherPassword between", value1, value2, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotBetween(String value1, String value2) {
            addCriterion("teacherPassword not between", value1, value2, "teacherpassword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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