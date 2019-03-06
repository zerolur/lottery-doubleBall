package com.ball.doubleball.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlgorithmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlgorithmExample() {
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

        public Criteria andAlgorithmNameIsNull() {
            addCriterion("algorithm_name is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameIsNotNull() {
            addCriterion("algorithm_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameEqualTo(String value) {
            addCriterion("algorithm_name =", value, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameNotEqualTo(String value) {
            addCriterion("algorithm_name <>", value, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameGreaterThan(String value) {
            addCriterion("algorithm_name >", value, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameGreaterThanOrEqualTo(String value) {
            addCriterion("algorithm_name >=", value, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameLessThan(String value) {
            addCriterion("algorithm_name <", value, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameLessThanOrEqualTo(String value) {
            addCriterion("algorithm_name <=", value, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameLike(String value) {
            addCriterion("algorithm_name like", value, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameNotLike(String value) {
            addCriterion("algorithm_name not like", value, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameIn(List<String> values) {
            addCriterion("algorithm_name in", values, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameNotIn(List<String> values) {
            addCriterion("algorithm_name not in", values, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameBetween(String value1, String value2) {
            addCriterion("algorithm_name between", value1, value2, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNameNotBetween(String value1, String value2) {
            addCriterion("algorithm_name not between", value1, value2, "algorithmName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesIsNull() {
            addCriterion("algorithm_des is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesIsNotNull() {
            addCriterion("algorithm_des is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesEqualTo(String value) {
            addCriterion("algorithm_des =", value, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesNotEqualTo(String value) {
            addCriterion("algorithm_des <>", value, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesGreaterThan(String value) {
            addCriterion("algorithm_des >", value, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesGreaterThanOrEqualTo(String value) {
            addCriterion("algorithm_des >=", value, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesLessThan(String value) {
            addCriterion("algorithm_des <", value, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesLessThanOrEqualTo(String value) {
            addCriterion("algorithm_des <=", value, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesLike(String value) {
            addCriterion("algorithm_des like", value, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesNotLike(String value) {
            addCriterion("algorithm_des not like", value, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesIn(List<String> values) {
            addCriterion("algorithm_des in", values, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesNotIn(List<String> values) {
            addCriterion("algorithm_des not in", values, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesBetween(String value1, String value2) {
            addCriterion("algorithm_des between", value1, value2, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmDesNotBetween(String value1, String value2) {
            addCriterion("algorithm_des not between", value1, value2, "algorithmDes");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdIsNull() {
            addCriterion("algorithm_author_id is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdIsNotNull() {
            addCriterion("algorithm_author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdEqualTo(Integer value) {
            addCriterion("algorithm_author_id =", value, "algorithmAuthorId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdNotEqualTo(Integer value) {
            addCriterion("algorithm_author_id <>", value, "algorithmAuthorId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdGreaterThan(Integer value) {
            addCriterion("algorithm_author_id >", value, "algorithmAuthorId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("algorithm_author_id >=", value, "algorithmAuthorId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdLessThan(Integer value) {
            addCriterion("algorithm_author_id <", value, "algorithmAuthorId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("algorithm_author_id <=", value, "algorithmAuthorId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdIn(List<Integer> values) {
            addCriterion("algorithm_author_id in", values, "algorithmAuthorId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdNotIn(List<Integer> values) {
            addCriterion("algorithm_author_id not in", values, "algorithmAuthorId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("algorithm_author_id between", value1, value2, "algorithmAuthorId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("algorithm_author_id not between", value1, value2, "algorithmAuthorId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameIsNull() {
            addCriterion("algorithm_author_name is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameIsNotNull() {
            addCriterion("algorithm_author_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameEqualTo(String value) {
            addCriterion("algorithm_author_name =", value, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameNotEqualTo(String value) {
            addCriterion("algorithm_author_name <>", value, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameGreaterThan(String value) {
            addCriterion("algorithm_author_name >", value, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("algorithm_author_name >=", value, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameLessThan(String value) {
            addCriterion("algorithm_author_name <", value, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("algorithm_author_name <=", value, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameLike(String value) {
            addCriterion("algorithm_author_name like", value, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameNotLike(String value) {
            addCriterion("algorithm_author_name not like", value, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameIn(List<String> values) {
            addCriterion("algorithm_author_name in", values, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameNotIn(List<String> values) {
            addCriterion("algorithm_author_name not in", values, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameBetween(String value1, String value2) {
            addCriterion("algorithm_author_name between", value1, value2, "algorithmAuthorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmAuthorNameNotBetween(String value1, String value2) {
            addCriterion("algorithm_author_name not between", value1, value2, "algorithmAuthorName");
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