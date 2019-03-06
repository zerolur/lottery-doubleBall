package com.ball.doubleball.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BileRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BileRecordExample() {
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

        public Criteria andLotteryNoIsNull() {
            addCriterion("lottery_no is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNoIsNotNull() {
            addCriterion("lottery_no is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNoEqualTo(Integer value) {
            addCriterion("lottery_no =", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoNotEqualTo(Integer value) {
            addCriterion("lottery_no <>", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoGreaterThan(Integer value) {
            addCriterion("lottery_no >", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("lottery_no >=", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoLessThan(Integer value) {
            addCriterion("lottery_no <", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoLessThanOrEqualTo(Integer value) {
            addCriterion("lottery_no <=", value, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoIn(List<Integer> values) {
            addCriterion("lottery_no in", values, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoNotIn(List<Integer> values) {
            addCriterion("lottery_no not in", values, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoBetween(Integer value1, Integer value2) {
            addCriterion("lottery_no between", value1, value2, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andLotteryNoNotBetween(Integer value1, Integer value2) {
            addCriterion("lottery_no not between", value1, value2, "lotteryNo");
            return (Criteria) this;
        }

        public Criteria andBilerIdIsNull() {
            addCriterion("biler_id is null");
            return (Criteria) this;
        }

        public Criteria andBilerIdIsNotNull() {
            addCriterion("biler_id is not null");
            return (Criteria) this;
        }

        public Criteria andBilerIdEqualTo(Integer value) {
            addCriterion("biler_id =", value, "bilerId");
            return (Criteria) this;
        }

        public Criteria andBilerIdNotEqualTo(Integer value) {
            addCriterion("biler_id <>", value, "bilerId");
            return (Criteria) this;
        }

        public Criteria andBilerIdGreaterThan(Integer value) {
            addCriterion("biler_id >", value, "bilerId");
            return (Criteria) this;
        }

        public Criteria andBilerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("biler_id >=", value, "bilerId");
            return (Criteria) this;
        }

        public Criteria andBilerIdLessThan(Integer value) {
            addCriterion("biler_id <", value, "bilerId");
            return (Criteria) this;
        }

        public Criteria andBilerIdLessThanOrEqualTo(Integer value) {
            addCriterion("biler_id <=", value, "bilerId");
            return (Criteria) this;
        }

        public Criteria andBilerIdIn(List<Integer> values) {
            addCriterion("biler_id in", values, "bilerId");
            return (Criteria) this;
        }

        public Criteria andBilerIdNotIn(List<Integer> values) {
            addCriterion("biler_id not in", values, "bilerId");
            return (Criteria) this;
        }

        public Criteria andBilerIdBetween(Integer value1, Integer value2) {
            addCriterion("biler_id between", value1, value2, "bilerId");
            return (Criteria) this;
        }

        public Criteria andBilerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("biler_id not between", value1, value2, "bilerId");
            return (Criteria) this;
        }

        public Criteria andBilerNameIsNull() {
            addCriterion("biler_name is null");
            return (Criteria) this;
        }

        public Criteria andBilerNameIsNotNull() {
            addCriterion("biler_name is not null");
            return (Criteria) this;
        }

        public Criteria andBilerNameEqualTo(String value) {
            addCriterion("biler_name =", value, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameNotEqualTo(String value) {
            addCriterion("biler_name <>", value, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameGreaterThan(String value) {
            addCriterion("biler_name >", value, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameGreaterThanOrEqualTo(String value) {
            addCriterion("biler_name >=", value, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameLessThan(String value) {
            addCriterion("biler_name <", value, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameLessThanOrEqualTo(String value) {
            addCriterion("biler_name <=", value, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameLike(String value) {
            addCriterion("biler_name like", value, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameNotLike(String value) {
            addCriterion("biler_name not like", value, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameIn(List<String> values) {
            addCriterion("biler_name in", values, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameNotIn(List<String> values) {
            addCriterion("biler_name not in", values, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameBetween(String value1, String value2) {
            addCriterion("biler_name between", value1, value2, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBilerNameNotBetween(String value1, String value2) {
            addCriterion("biler_name not between", value1, value2, "bilerName");
            return (Criteria) this;
        }

        public Criteria andBileTypeIsNull() {
            addCriterion("bile_type is null");
            return (Criteria) this;
        }

        public Criteria andBileTypeIsNotNull() {
            addCriterion("bile_type is not null");
            return (Criteria) this;
        }

        public Criteria andBileTypeEqualTo(Byte value) {
            addCriterion("bile_type =", value, "bileType");
            return (Criteria) this;
        }

        public Criteria andBileTypeNotEqualTo(Byte value) {
            addCriterion("bile_type <>", value, "bileType");
            return (Criteria) this;
        }

        public Criteria andBileTypeGreaterThan(Byte value) {
            addCriterion("bile_type >", value, "bileType");
            return (Criteria) this;
        }

        public Criteria andBileTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("bile_type >=", value, "bileType");
            return (Criteria) this;
        }

        public Criteria andBileTypeLessThan(Byte value) {
            addCriterion("bile_type <", value, "bileType");
            return (Criteria) this;
        }

        public Criteria andBileTypeLessThanOrEqualTo(Byte value) {
            addCriterion("bile_type <=", value, "bileType");
            return (Criteria) this;
        }

        public Criteria andBileTypeIn(List<Byte> values) {
            addCriterion("bile_type in", values, "bileType");
            return (Criteria) this;
        }

        public Criteria andBileTypeNotIn(List<Byte> values) {
            addCriterion("bile_type not in", values, "bileType");
            return (Criteria) this;
        }

        public Criteria andBileTypeBetween(Byte value1, Byte value2) {
            addCriterion("bile_type between", value1, value2, "bileType");
            return (Criteria) this;
        }

        public Criteria andBileTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("bile_type not between", value1, value2, "bileType");
            return (Criteria) this;
        }

        public Criteria andBileNumIsNull() {
            addCriterion("bile_num is null");
            return (Criteria) this;
        }

        public Criteria andBileNumIsNotNull() {
            addCriterion("bile_num is not null");
            return (Criteria) this;
        }

        public Criteria andBileNumEqualTo(Integer value) {
            addCriterion("bile_num =", value, "bileNum");
            return (Criteria) this;
        }

        public Criteria andBileNumNotEqualTo(Integer value) {
            addCriterion("bile_num <>", value, "bileNum");
            return (Criteria) this;
        }

        public Criteria andBileNumGreaterThan(Integer value) {
            addCriterion("bile_num >", value, "bileNum");
            return (Criteria) this;
        }

        public Criteria andBileNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bile_num >=", value, "bileNum");
            return (Criteria) this;
        }

        public Criteria andBileNumLessThan(Integer value) {
            addCriterion("bile_num <", value, "bileNum");
            return (Criteria) this;
        }

        public Criteria andBileNumLessThanOrEqualTo(Integer value) {
            addCriterion("bile_num <=", value, "bileNum");
            return (Criteria) this;
        }

        public Criteria andBileNumIn(List<Integer> values) {
            addCriterion("bile_num in", values, "bileNum");
            return (Criteria) this;
        }

        public Criteria andBileNumNotIn(List<Integer> values) {
            addCriterion("bile_num not in", values, "bileNum");
            return (Criteria) this;
        }

        public Criteria andBileNumBetween(Integer value1, Integer value2) {
            addCriterion("bile_num between", value1, value2, "bileNum");
            return (Criteria) this;
        }

        public Criteria andBileNumNotBetween(Integer value1, Integer value2) {
            addCriterion("bile_num not between", value1, value2, "bileNum");
            return (Criteria) this;
        }

        public Criteria andBileHisRateIsNull() {
            addCriterion("bile_his_rate is null");
            return (Criteria) this;
        }

        public Criteria andBileHisRateIsNotNull() {
            addCriterion("bile_his_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBileHisRateEqualTo(Integer value) {
            addCriterion("bile_his_rate =", value, "bileHisRate");
            return (Criteria) this;
        }

        public Criteria andBileHisRateNotEqualTo(Integer value) {
            addCriterion("bile_his_rate <>", value, "bileHisRate");
            return (Criteria) this;
        }

        public Criteria andBileHisRateGreaterThan(Integer value) {
            addCriterion("bile_his_rate >", value, "bileHisRate");
            return (Criteria) this;
        }

        public Criteria andBileHisRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bile_his_rate >=", value, "bileHisRate");
            return (Criteria) this;
        }

        public Criteria andBileHisRateLessThan(Integer value) {
            addCriterion("bile_his_rate <", value, "bileHisRate");
            return (Criteria) this;
        }

        public Criteria andBileHisRateLessThanOrEqualTo(Integer value) {
            addCriterion("bile_his_rate <=", value, "bileHisRate");
            return (Criteria) this;
        }

        public Criteria andBileHisRateIn(List<Integer> values) {
            addCriterion("bile_his_rate in", values, "bileHisRate");
            return (Criteria) this;
        }

        public Criteria andBileHisRateNotIn(List<Integer> values) {
            addCriterion("bile_his_rate not in", values, "bileHisRate");
            return (Criteria) this;
        }

        public Criteria andBileHisRateBetween(Integer value1, Integer value2) {
            addCriterion("bile_his_rate between", value1, value2, "bileHisRate");
            return (Criteria) this;
        }

        public Criteria andBileHisRateNotBetween(Integer value1, Integer value2) {
            addCriterion("bile_his_rate not between", value1, value2, "bileHisRate");
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