package com.ball.doubleball.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BallsRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BallsRecordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andBallTypeIsNull() {
            addCriterion("ball_type is null");
            return (Criteria) this;
        }

        public Criteria andBallTypeIsNotNull() {
            addCriterion("ball_type is not null");
            return (Criteria) this;
        }

        public Criteria andBallTypeEqualTo(Byte value) {
            addCriterion("ball_type =", value, "ballType");
            return (Criteria) this;
        }

        public Criteria andBallTypeNotEqualTo(Byte value) {
            addCriterion("ball_type <>", value, "ballType");
            return (Criteria) this;
        }

        public Criteria andBallTypeGreaterThan(Byte value) {
            addCriterion("ball_type >", value, "ballType");
            return (Criteria) this;
        }

        public Criteria andBallTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("ball_type >=", value, "ballType");
            return (Criteria) this;
        }

        public Criteria andBallTypeLessThan(Byte value) {
            addCriterion("ball_type <", value, "ballType");
            return (Criteria) this;
        }

        public Criteria andBallTypeLessThanOrEqualTo(Byte value) {
            addCriterion("ball_type <=", value, "ballType");
            return (Criteria) this;
        }

        public Criteria andBallTypeIn(List<Byte> values) {
            addCriterion("ball_type in", values, "ballType");
            return (Criteria) this;
        }

        public Criteria andBallTypeNotIn(List<Byte> values) {
            addCriterion("ball_type not in", values, "ballType");
            return (Criteria) this;
        }

        public Criteria andBallTypeBetween(Byte value1, Byte value2) {
            addCriterion("ball_type between", value1, value2, "ballType");
            return (Criteria) this;
        }

        public Criteria andBallTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("ball_type not between", value1, value2, "ballType");
            return (Criteria) this;
        }

        public Criteria andForecastTypeIsNull() {
            addCriterion("forecast_type is null");
            return (Criteria) this;
        }

        public Criteria andForecastTypeIsNotNull() {
            addCriterion("forecast_type is not null");
            return (Criteria) this;
        }

        public Criteria andForecastTypeEqualTo(Byte value) {
            addCriterion("forecast_type =", value, "forecastType");
            return (Criteria) this;
        }

        public Criteria andForecastTypeNotEqualTo(Byte value) {
            addCriterion("forecast_type <>", value, "forecastType");
            return (Criteria) this;
        }

        public Criteria andForecastTypeGreaterThan(Byte value) {
            addCriterion("forecast_type >", value, "forecastType");
            return (Criteria) this;
        }

        public Criteria andForecastTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("forecast_type >=", value, "forecastType");
            return (Criteria) this;
        }

        public Criteria andForecastTypeLessThan(Byte value) {
            addCriterion("forecast_type <", value, "forecastType");
            return (Criteria) this;
        }

        public Criteria andForecastTypeLessThanOrEqualTo(Byte value) {
            addCriterion("forecast_type <=", value, "forecastType");
            return (Criteria) this;
        }

        public Criteria andForecastTypeIn(List<Byte> values) {
            addCriterion("forecast_type in", values, "forecastType");
            return (Criteria) this;
        }

        public Criteria andForecastTypeNotIn(List<Byte> values) {
            addCriterion("forecast_type not in", values, "forecastType");
            return (Criteria) this;
        }

        public Criteria andForecastTypeBetween(Byte value1, Byte value2) {
            addCriterion("forecast_type between", value1, value2, "forecastType");
            return (Criteria) this;
        }

        public Criteria andForecastTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("forecast_type not between", value1, value2, "forecastType");
            return (Criteria) this;
        }

        public Criteria andBallCountIsNull() {
            addCriterion("ball_count is null");
            return (Criteria) this;
        }

        public Criteria andBallCountIsNotNull() {
            addCriterion("ball_count is not null");
            return (Criteria) this;
        }

        public Criteria andBallCountEqualTo(Integer value) {
            addCriterion("ball_count =", value, "ballCount");
            return (Criteria) this;
        }

        public Criteria andBallCountNotEqualTo(Integer value) {
            addCriterion("ball_count <>", value, "ballCount");
            return (Criteria) this;
        }

        public Criteria andBallCountGreaterThan(Integer value) {
            addCriterion("ball_count >", value, "ballCount");
            return (Criteria) this;
        }

        public Criteria andBallCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ball_count >=", value, "ballCount");
            return (Criteria) this;
        }

        public Criteria andBallCountLessThan(Integer value) {
            addCriterion("ball_count <", value, "ballCount");
            return (Criteria) this;
        }

        public Criteria andBallCountLessThanOrEqualTo(Integer value) {
            addCriterion("ball_count <=", value, "ballCount");
            return (Criteria) this;
        }

        public Criteria andBallCountIn(List<Integer> values) {
            addCriterion("ball_count in", values, "ballCount");
            return (Criteria) this;
        }

        public Criteria andBallCountNotIn(List<Integer> values) {
            addCriterion("ball_count not in", values, "ballCount");
            return (Criteria) this;
        }

        public Criteria andBallCountBetween(Integer value1, Integer value2) {
            addCriterion("ball_count between", value1, value2, "ballCount");
            return (Criteria) this;
        }

        public Criteria andBallCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ball_count not between", value1, value2, "ballCount");
            return (Criteria) this;
        }

        public Criteria andBallNumberIsNull() {
            addCriterion("ball_number is null");
            return (Criteria) this;
        }

        public Criteria andBallNumberIsNotNull() {
            addCriterion("ball_number is not null");
            return (Criteria) this;
        }

        public Criteria andBallNumberEqualTo(Integer value) {
            addCriterion("ball_number =", value, "ballNumber");
            return (Criteria) this;
        }

        public Criteria andBallNumberNotEqualTo(Integer value) {
            addCriterion("ball_number <>", value, "ballNumber");
            return (Criteria) this;
        }

        public Criteria andBallNumberGreaterThan(Integer value) {
            addCriterion("ball_number >", value, "ballNumber");
            return (Criteria) this;
        }

        public Criteria andBallNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ball_number >=", value, "ballNumber");
            return (Criteria) this;
        }

        public Criteria andBallNumberLessThan(Integer value) {
            addCriterion("ball_number <", value, "ballNumber");
            return (Criteria) this;
        }

        public Criteria andBallNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ball_number <=", value, "ballNumber");
            return (Criteria) this;
        }

        public Criteria andBallNumberIn(List<Integer> values) {
            addCriterion("ball_number in", values, "ballNumber");
            return (Criteria) this;
        }

        public Criteria andBallNumberNotIn(List<Integer> values) {
            addCriterion("ball_number not in", values, "ballNumber");
            return (Criteria) this;
        }

        public Criteria andBallNumberBetween(Integer value1, Integer value2) {
            addCriterion("ball_number between", value1, value2, "ballNumber");
            return (Criteria) this;
        }

        public Criteria andBallNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ball_number not between", value1, value2, "ballNumber");
            return (Criteria) this;
        }

        public Criteria andHisRateIsNull() {
            addCriterion("his_rate is null");
            return (Criteria) this;
        }

        public Criteria andHisRateIsNotNull() {
            addCriterion("his_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHisRateEqualTo(Integer value) {
            addCriterion("his_rate =", value, "hisRate");
            return (Criteria) this;
        }

        public Criteria andHisRateNotEqualTo(Integer value) {
            addCriterion("his_rate <>", value, "hisRate");
            return (Criteria) this;
        }

        public Criteria andHisRateGreaterThan(Integer value) {
            addCriterion("his_rate >", value, "hisRate");
            return (Criteria) this;
        }

        public Criteria andHisRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("his_rate >=", value, "hisRate");
            return (Criteria) this;
        }

        public Criteria andHisRateLessThan(Integer value) {
            addCriterion("his_rate <", value, "hisRate");
            return (Criteria) this;
        }

        public Criteria andHisRateLessThanOrEqualTo(Integer value) {
            addCriterion("his_rate <=", value, "hisRate");
            return (Criteria) this;
        }

        public Criteria andHisRateIn(List<Integer> values) {
            addCriterion("his_rate in", values, "hisRate");
            return (Criteria) this;
        }

        public Criteria andHisRateNotIn(List<Integer> values) {
            addCriterion("his_rate not in", values, "hisRate");
            return (Criteria) this;
        }

        public Criteria andHisRateBetween(Integer value1, Integer value2) {
            addCriterion("his_rate between", value1, value2, "hisRate");
            return (Criteria) this;
        }

        public Criteria andHisRateNotBetween(Integer value1, Integer value2) {
            addCriterion("his_rate not between", value1, value2, "hisRate");
            return (Criteria) this;
        }

        public Criteria andAdoptIsNull() {
            addCriterion("adopt is null");
            return (Criteria) this;
        }

        public Criteria andAdoptIsNotNull() {
            addCriterion("adopt is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptEqualTo(Byte value) {
            addCriterion("adopt =", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptNotEqualTo(Byte value) {
            addCriterion("adopt <>", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptGreaterThan(Byte value) {
            addCriterion("adopt >", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptGreaterThanOrEqualTo(Byte value) {
            addCriterion("adopt >=", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptLessThan(Byte value) {
            addCriterion("adopt <", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptLessThanOrEqualTo(Byte value) {
            addCriterion("adopt <=", value, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptIn(List<Byte> values) {
            addCriterion("adopt in", values, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptNotIn(List<Byte> values) {
            addCriterion("adopt not in", values, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptBetween(Byte value1, Byte value2) {
            addCriterion("adopt between", value1, value2, "adopt");
            return (Criteria) this;
        }

        public Criteria andAdoptNotBetween(Byte value1, Byte value2) {
            addCriterion("adopt not between", value1, value2, "adopt");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Integer value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Integer value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Integer value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Integer value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Integer> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Integer> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
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