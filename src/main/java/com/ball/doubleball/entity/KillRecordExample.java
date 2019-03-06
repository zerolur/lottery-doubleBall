package com.ball.doubleball.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KillRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KillRecordExample() {
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

        public Criteria andKillerIdIsNull() {
            addCriterion("killer_id is null");
            return (Criteria) this;
        }

        public Criteria andKillerIdIsNotNull() {
            addCriterion("killer_id is not null");
            return (Criteria) this;
        }

        public Criteria andKillerIdEqualTo(Integer value) {
            addCriterion("killer_id =", value, "killerId");
            return (Criteria) this;
        }

        public Criteria andKillerIdNotEqualTo(Integer value) {
            addCriterion("killer_id <>", value, "killerId");
            return (Criteria) this;
        }

        public Criteria andKillerIdGreaterThan(Integer value) {
            addCriterion("killer_id >", value, "killerId");
            return (Criteria) this;
        }

        public Criteria andKillerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("killer_id >=", value, "killerId");
            return (Criteria) this;
        }

        public Criteria andKillerIdLessThan(Integer value) {
            addCriterion("killer_id <", value, "killerId");
            return (Criteria) this;
        }

        public Criteria andKillerIdLessThanOrEqualTo(Integer value) {
            addCriterion("killer_id <=", value, "killerId");
            return (Criteria) this;
        }

        public Criteria andKillerIdIn(List<Integer> values) {
            addCriterion("killer_id in", values, "killerId");
            return (Criteria) this;
        }

        public Criteria andKillerIdNotIn(List<Integer> values) {
            addCriterion("killer_id not in", values, "killerId");
            return (Criteria) this;
        }

        public Criteria andKillerIdBetween(Integer value1, Integer value2) {
            addCriterion("killer_id between", value1, value2, "killerId");
            return (Criteria) this;
        }

        public Criteria andKillerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("killer_id not between", value1, value2, "killerId");
            return (Criteria) this;
        }

        public Criteria andKillerNameIsNull() {
            addCriterion("killer_name is null");
            return (Criteria) this;
        }

        public Criteria andKillerNameIsNotNull() {
            addCriterion("killer_name is not null");
            return (Criteria) this;
        }

        public Criteria andKillerNameEqualTo(String value) {
            addCriterion("killer_name =", value, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameNotEqualTo(String value) {
            addCriterion("killer_name <>", value, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameGreaterThan(String value) {
            addCriterion("killer_name >", value, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameGreaterThanOrEqualTo(String value) {
            addCriterion("killer_name >=", value, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameLessThan(String value) {
            addCriterion("killer_name <", value, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameLessThanOrEqualTo(String value) {
            addCriterion("killer_name <=", value, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameLike(String value) {
            addCriterion("killer_name like", value, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameNotLike(String value) {
            addCriterion("killer_name not like", value, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameIn(List<String> values) {
            addCriterion("killer_name in", values, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameNotIn(List<String> values) {
            addCriterion("killer_name not in", values, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameBetween(String value1, String value2) {
            addCriterion("killer_name between", value1, value2, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillerNameNotBetween(String value1, String value2) {
            addCriterion("killer_name not between", value1, value2, "killerName");
            return (Criteria) this;
        }

        public Criteria andKillTypeIsNull() {
            addCriterion("kill_type is null");
            return (Criteria) this;
        }

        public Criteria andKillTypeIsNotNull() {
            addCriterion("kill_type is not null");
            return (Criteria) this;
        }

        public Criteria andKillTypeEqualTo(Byte value) {
            addCriterion("kill_type =", value, "killType");
            return (Criteria) this;
        }

        public Criteria andKillTypeNotEqualTo(Byte value) {
            addCriterion("kill_type <>", value, "killType");
            return (Criteria) this;
        }

        public Criteria andKillTypeGreaterThan(Byte value) {
            addCriterion("kill_type >", value, "killType");
            return (Criteria) this;
        }

        public Criteria andKillTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("kill_type >=", value, "killType");
            return (Criteria) this;
        }

        public Criteria andKillTypeLessThan(Byte value) {
            addCriterion("kill_type <", value, "killType");
            return (Criteria) this;
        }

        public Criteria andKillTypeLessThanOrEqualTo(Byte value) {
            addCriterion("kill_type <=", value, "killType");
            return (Criteria) this;
        }

        public Criteria andKillTypeIn(List<Byte> values) {
            addCriterion("kill_type in", values, "killType");
            return (Criteria) this;
        }

        public Criteria andKillTypeNotIn(List<Byte> values) {
            addCriterion("kill_type not in", values, "killType");
            return (Criteria) this;
        }

        public Criteria andKillTypeBetween(Byte value1, Byte value2) {
            addCriterion("kill_type between", value1, value2, "killType");
            return (Criteria) this;
        }

        public Criteria andKillTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("kill_type not between", value1, value2, "killType");
            return (Criteria) this;
        }

        public Criteria andKillNumIsNull() {
            addCriterion("kill_num is null");
            return (Criteria) this;
        }

        public Criteria andKillNumIsNotNull() {
            addCriterion("kill_num is not null");
            return (Criteria) this;
        }

        public Criteria andKillNumEqualTo(Integer value) {
            addCriterion("kill_num =", value, "killNum");
            return (Criteria) this;
        }

        public Criteria andKillNumNotEqualTo(Integer value) {
            addCriterion("kill_num <>", value, "killNum");
            return (Criteria) this;
        }

        public Criteria andKillNumGreaterThan(Integer value) {
            addCriterion("kill_num >", value, "killNum");
            return (Criteria) this;
        }

        public Criteria andKillNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("kill_num >=", value, "killNum");
            return (Criteria) this;
        }

        public Criteria andKillNumLessThan(Integer value) {
            addCriterion("kill_num <", value, "killNum");
            return (Criteria) this;
        }

        public Criteria andKillNumLessThanOrEqualTo(Integer value) {
            addCriterion("kill_num <=", value, "killNum");
            return (Criteria) this;
        }

        public Criteria andKillNumIn(List<Integer> values) {
            addCriterion("kill_num in", values, "killNum");
            return (Criteria) this;
        }

        public Criteria andKillNumNotIn(List<Integer> values) {
            addCriterion("kill_num not in", values, "killNum");
            return (Criteria) this;
        }

        public Criteria andKillNumBetween(Integer value1, Integer value2) {
            addCriterion("kill_num between", value1, value2, "killNum");
            return (Criteria) this;
        }

        public Criteria andKillNumNotBetween(Integer value1, Integer value2) {
            addCriterion("kill_num not between", value1, value2, "killNum");
            return (Criteria) this;
        }

        public Criteria andKillHisRateIsNull() {
            addCriterion("kill_his_rate is null");
            return (Criteria) this;
        }

        public Criteria andKillHisRateIsNotNull() {
            addCriterion("kill_his_rate is not null");
            return (Criteria) this;
        }

        public Criteria andKillHisRateEqualTo(Integer value) {
            addCriterion("kill_his_rate =", value, "killHisRate");
            return (Criteria) this;
        }

        public Criteria andKillHisRateNotEqualTo(Integer value) {
            addCriterion("kill_his_rate <>", value, "killHisRate");
            return (Criteria) this;
        }

        public Criteria andKillHisRateGreaterThan(Integer value) {
            addCriterion("kill_his_rate >", value, "killHisRate");
            return (Criteria) this;
        }

        public Criteria andKillHisRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("kill_his_rate >=", value, "killHisRate");
            return (Criteria) this;
        }

        public Criteria andKillHisRateLessThan(Integer value) {
            addCriterion("kill_his_rate <", value, "killHisRate");
            return (Criteria) this;
        }

        public Criteria andKillHisRateLessThanOrEqualTo(Integer value) {
            addCriterion("kill_his_rate <=", value, "killHisRate");
            return (Criteria) this;
        }

        public Criteria andKillHisRateIn(List<Integer> values) {
            addCriterion("kill_his_rate in", values, "killHisRate");
            return (Criteria) this;
        }

        public Criteria andKillHisRateNotIn(List<Integer> values) {
            addCriterion("kill_his_rate not in", values, "killHisRate");
            return (Criteria) this;
        }

        public Criteria andKillHisRateBetween(Integer value1, Integer value2) {
            addCriterion("kill_his_rate between", value1, value2, "killHisRate");
            return (Criteria) this;
        }

        public Criteria andKillHisRateNotBetween(Integer value1, Integer value2) {
            addCriterion("kill_his_rate not between", value1, value2, "killHisRate");
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