package com.example.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class s_homeworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public s_homeworkExample() {
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

        public Criteria andHomeworkidIsNull() {
            addCriterion("homeworkId is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkidIsNotNull() {
            addCriterion("homeworkId is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkidEqualTo(Long value) {
            addCriterion("homeworkId =", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidNotEqualTo(Long value) {
            addCriterion("homeworkId <>", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidGreaterThan(Long value) {
            addCriterion("homeworkId >", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidGreaterThanOrEqualTo(Long value) {
            addCriterion("homeworkId >=", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidLessThan(Long value) {
            addCriterion("homeworkId <", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidLessThanOrEqualTo(Long value) {
            addCriterion("homeworkId <=", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidIn(List<Long> values) {
            addCriterion("homeworkId in", values, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidNotIn(List<Long> values) {
            addCriterion("homeworkId not in", values, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidBetween(Long value1, Long value2) {
            addCriterion("homeworkId between", value1, value2, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidNotBetween(Long value1, Long value2) {
            addCriterion("homeworkId not between", value1, value2, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleIsNull() {
            addCriterion("homeworkTitle is null");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleIsNotNull() {
            addCriterion("homeworkTitle is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleEqualTo(String value) {
            addCriterion("homeworkTitle =", value, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleNotEqualTo(String value) {
            addCriterion("homeworkTitle <>", value, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleGreaterThan(String value) {
            addCriterion("homeworkTitle >", value, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleGreaterThanOrEqualTo(String value) {
            addCriterion("homeworkTitle >=", value, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleLessThan(String value) {
            addCriterion("homeworkTitle <", value, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleLessThanOrEqualTo(String value) {
            addCriterion("homeworkTitle <=", value, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleLike(String value) {
            addCriterion("homeworkTitle like", value, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleNotLike(String value) {
            addCriterion("homeworkTitle not like", value, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleIn(List<String> values) {
            addCriterion("homeworkTitle in", values, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleNotIn(List<String> values) {
            addCriterion("homeworkTitle not in", values, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleBetween(String value1, String value2) {
            addCriterion("homeworkTitle between", value1, value2, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andHomeworktitleNotBetween(String value1, String value2) {
            addCriterion("homeworkTitle not between", value1, value2, "homeworktitle");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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