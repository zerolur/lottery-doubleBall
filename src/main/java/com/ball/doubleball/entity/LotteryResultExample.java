package com.ball.doubleball.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LotteryResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryResultExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andLotteryIdIsNull() {
            addCriterion("lottery_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNotNull() {
            addCriterion("lottery_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdEqualTo(String value) {
            addCriterion("lottery_id =", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotEqualTo(String value) {
            addCriterion("lottery_id <>", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThan(String value) {
            addCriterion("lottery_id >", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_id >=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThan(String value) {
            addCriterion("lottery_id <", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThanOrEqualTo(String value) {
            addCriterion("lottery_id <=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLike(String value) {
            addCriterion("lottery_id like", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotLike(String value) {
            addCriterion("lottery_id not like", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIn(List<String> values) {
            addCriterion("lottery_id in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotIn(List<String> values) {
            addCriterion("lottery_id not in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdBetween(String value1, String value2) {
            addCriterion("lottery_id between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotBetween(String value1, String value2) {
            addCriterion("lottery_id not between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIsNull() {
            addCriterion("lottery_name is null");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIsNotNull() {
            addCriterion("lottery_name is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryNameEqualTo(String value) {
            addCriterion("lottery_name =", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotEqualTo(String value) {
            addCriterion("lottery_name <>", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameGreaterThan(String value) {
            addCriterion("lottery_name >", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_name >=", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLessThan(String value) {
            addCriterion("lottery_name <", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLessThanOrEqualTo(String value) {
            addCriterion("lottery_name <=", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameLike(String value) {
            addCriterion("lottery_name like", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotLike(String value) {
            addCriterion("lottery_name not like", value, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameIn(List<String> values) {
            addCriterion("lottery_name in", values, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotIn(List<String> values) {
            addCriterion("lottery_name not in", values, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameBetween(String value1, String value2) {
            addCriterion("lottery_name between", value1, value2, "lotteryName");
            return (Criteria) this;
        }

        public Criteria andLotteryNameNotBetween(String value1, String value2) {
            addCriterion("lottery_name not between", value1, value2, "lotteryName");
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

        public Criteria andLotteryDateIsNull() {
            addCriterion("lottery_date is null");
            return (Criteria) this;
        }

        public Criteria andLotteryDateIsNotNull() {
            addCriterion("lottery_date is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryDateEqualTo(Date value) {
            addCriterionForJDBCDate("lottery_date =", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lottery_date <>", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("lottery_date >", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lottery_date >=", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateLessThan(Date value) {
            addCriterionForJDBCDate("lottery_date <", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lottery_date <=", value, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateIn(List<Date> values) {
            addCriterionForJDBCDate("lottery_date in", values, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lottery_date not in", values, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lottery_date between", value1, value2, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotteryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lottery_date not between", value1, value2, "lotteryDate");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountIsNull() {
            addCriterion("lottery_sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountIsNotNull() {
            addCriterion("lottery_sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountEqualTo(String value) {
            addCriterion("lottery_sale_amount =", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountNotEqualTo(String value) {
            addCriterion("lottery_sale_amount <>", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountGreaterThan(String value) {
            addCriterion("lottery_sale_amount >", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_sale_amount >=", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountLessThan(String value) {
            addCriterion("lottery_sale_amount <", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountLessThanOrEqualTo(String value) {
            addCriterion("lottery_sale_amount <=", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountLike(String value) {
            addCriterion("lottery_sale_amount like", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountNotLike(String value) {
            addCriterion("lottery_sale_amount not like", value, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountIn(List<String> values) {
            addCriterion("lottery_sale_amount in", values, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountNotIn(List<String> values) {
            addCriterion("lottery_sale_amount not in", values, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountBetween(String value1, String value2) {
            addCriterion("lottery_sale_amount between", value1, value2, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotterySaleAmountNotBetween(String value1, String value2) {
            addCriterion("lottery_sale_amount not between", value1, value2, "lotterySaleAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountIsNull() {
            addCriterion("lottery_pool_amount is null");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountIsNotNull() {
            addCriterion("lottery_pool_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountEqualTo(String value) {
            addCriterion("lottery_pool_amount =", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountNotEqualTo(String value) {
            addCriterion("lottery_pool_amount <>", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountGreaterThan(String value) {
            addCriterion("lottery_pool_amount >", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_pool_amount >=", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountLessThan(String value) {
            addCriterion("lottery_pool_amount <", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountLessThanOrEqualTo(String value) {
            addCriterion("lottery_pool_amount <=", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountLike(String value) {
            addCriterion("lottery_pool_amount like", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountNotLike(String value) {
            addCriterion("lottery_pool_amount not like", value, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountIn(List<String> values) {
            addCriterion("lottery_pool_amount in", values, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountNotIn(List<String> values) {
            addCriterion("lottery_pool_amount not in", values, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountBetween(String value1, String value2) {
            addCriterion("lottery_pool_amount between", value1, value2, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andLotteryPoolAmountNotBetween(String value1, String value2) {
            addCriterion("lottery_pool_amount not between", value1, value2, "lotteryPoolAmount");
            return (Criteria) this;
        }

        public Criteria andBfOneBallIsNull() {
            addCriterion("bf_one_ball is null");
            return (Criteria) this;
        }

        public Criteria andBfOneBallIsNotNull() {
            addCriterion("bf_one_ball is not null");
            return (Criteria) this;
        }

        public Criteria andBfOneBallEqualTo(Integer value) {
            addCriterion("bf_one_ball =", value, "bfOneBall");
            return (Criteria) this;
        }

        public Criteria andBfOneBallNotEqualTo(Integer value) {
            addCriterion("bf_one_ball <>", value, "bfOneBall");
            return (Criteria) this;
        }

        public Criteria andBfOneBallGreaterThan(Integer value) {
            addCriterion("bf_one_ball >", value, "bfOneBall");
            return (Criteria) this;
        }

        public Criteria andBfOneBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("bf_one_ball >=", value, "bfOneBall");
            return (Criteria) this;
        }

        public Criteria andBfOneBallLessThan(Integer value) {
            addCriterion("bf_one_ball <", value, "bfOneBall");
            return (Criteria) this;
        }

        public Criteria andBfOneBallLessThanOrEqualTo(Integer value) {
            addCriterion("bf_one_ball <=", value, "bfOneBall");
            return (Criteria) this;
        }

        public Criteria andBfOneBallIn(List<Integer> values) {
            addCriterion("bf_one_ball in", values, "bfOneBall");
            return (Criteria) this;
        }

        public Criteria andBfOneBallNotIn(List<Integer> values) {
            addCriterion("bf_one_ball not in", values, "bfOneBall");
            return (Criteria) this;
        }

        public Criteria andBfOneBallBetween(Integer value1, Integer value2) {
            addCriterion("bf_one_ball between", value1, value2, "bfOneBall");
            return (Criteria) this;
        }

        public Criteria andBfOneBallNotBetween(Integer value1, Integer value2) {
            addCriterion("bf_one_ball not between", value1, value2, "bfOneBall");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallIsNull() {
            addCriterion("bf_two_ball is null");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallIsNotNull() {
            addCriterion("bf_two_ball is not null");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallEqualTo(Integer value) {
            addCriterion("bf_two_ball =", value, "bfTwoBall");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallNotEqualTo(Integer value) {
            addCriterion("bf_two_ball <>", value, "bfTwoBall");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallGreaterThan(Integer value) {
            addCriterion("bf_two_ball >", value, "bfTwoBall");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("bf_two_ball >=", value, "bfTwoBall");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallLessThan(Integer value) {
            addCriterion("bf_two_ball <", value, "bfTwoBall");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallLessThanOrEqualTo(Integer value) {
            addCriterion("bf_two_ball <=", value, "bfTwoBall");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallIn(List<Integer> values) {
            addCriterion("bf_two_ball in", values, "bfTwoBall");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallNotIn(List<Integer> values) {
            addCriterion("bf_two_ball not in", values, "bfTwoBall");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallBetween(Integer value1, Integer value2) {
            addCriterion("bf_two_ball between", value1, value2, "bfTwoBall");
            return (Criteria) this;
        }

        public Criteria andBfTwoBallNotBetween(Integer value1, Integer value2) {
            addCriterion("bf_two_ball not between", value1, value2, "bfTwoBall");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallIsNull() {
            addCriterion("bf_three_ball is null");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallIsNotNull() {
            addCriterion("bf_three_ball is not null");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallEqualTo(Integer value) {
            addCriterion("bf_three_ball =", value, "bfThreeBall");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallNotEqualTo(Integer value) {
            addCriterion("bf_three_ball <>", value, "bfThreeBall");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallGreaterThan(Integer value) {
            addCriterion("bf_three_ball >", value, "bfThreeBall");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("bf_three_ball >=", value, "bfThreeBall");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallLessThan(Integer value) {
            addCriterion("bf_three_ball <", value, "bfThreeBall");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallLessThanOrEqualTo(Integer value) {
            addCriterion("bf_three_ball <=", value, "bfThreeBall");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallIn(List<Integer> values) {
            addCriterion("bf_three_ball in", values, "bfThreeBall");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallNotIn(List<Integer> values) {
            addCriterion("bf_three_ball not in", values, "bfThreeBall");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallBetween(Integer value1, Integer value2) {
            addCriterion("bf_three_ball between", value1, value2, "bfThreeBall");
            return (Criteria) this;
        }

        public Criteria andBfThreeBallNotBetween(Integer value1, Integer value2) {
            addCriterion("bf_three_ball not between", value1, value2, "bfThreeBall");
            return (Criteria) this;
        }

        public Criteria andBfFourBallIsNull() {
            addCriterion("bf_four_ball is null");
            return (Criteria) this;
        }

        public Criteria andBfFourBallIsNotNull() {
            addCriterion("bf_four_ball is not null");
            return (Criteria) this;
        }

        public Criteria andBfFourBallEqualTo(Integer value) {
            addCriterion("bf_four_ball =", value, "bfFourBall");
            return (Criteria) this;
        }

        public Criteria andBfFourBallNotEqualTo(Integer value) {
            addCriterion("bf_four_ball <>", value, "bfFourBall");
            return (Criteria) this;
        }

        public Criteria andBfFourBallGreaterThan(Integer value) {
            addCriterion("bf_four_ball >", value, "bfFourBall");
            return (Criteria) this;
        }

        public Criteria andBfFourBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("bf_four_ball >=", value, "bfFourBall");
            return (Criteria) this;
        }

        public Criteria andBfFourBallLessThan(Integer value) {
            addCriterion("bf_four_ball <", value, "bfFourBall");
            return (Criteria) this;
        }

        public Criteria andBfFourBallLessThanOrEqualTo(Integer value) {
            addCriterion("bf_four_ball <=", value, "bfFourBall");
            return (Criteria) this;
        }

        public Criteria andBfFourBallIn(List<Integer> values) {
            addCriterion("bf_four_ball in", values, "bfFourBall");
            return (Criteria) this;
        }

        public Criteria andBfFourBallNotIn(List<Integer> values) {
            addCriterion("bf_four_ball not in", values, "bfFourBall");
            return (Criteria) this;
        }

        public Criteria andBfFourBallBetween(Integer value1, Integer value2) {
            addCriterion("bf_four_ball between", value1, value2, "bfFourBall");
            return (Criteria) this;
        }

        public Criteria andBfFourBallNotBetween(Integer value1, Integer value2) {
            addCriterion("bf_four_ball not between", value1, value2, "bfFourBall");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallIsNull() {
            addCriterion("bf_five_ball is null");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallIsNotNull() {
            addCriterion("bf_five_ball is not null");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallEqualTo(Integer value) {
            addCriterion("bf_five_ball =", value, "bfFiveBall");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallNotEqualTo(Integer value) {
            addCriterion("bf_five_ball <>", value, "bfFiveBall");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallGreaterThan(Integer value) {
            addCriterion("bf_five_ball >", value, "bfFiveBall");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("bf_five_ball >=", value, "bfFiveBall");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallLessThan(Integer value) {
            addCriterion("bf_five_ball <", value, "bfFiveBall");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallLessThanOrEqualTo(Integer value) {
            addCriterion("bf_five_ball <=", value, "bfFiveBall");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallIn(List<Integer> values) {
            addCriterion("bf_five_ball in", values, "bfFiveBall");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallNotIn(List<Integer> values) {
            addCriterion("bf_five_ball not in", values, "bfFiveBall");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallBetween(Integer value1, Integer value2) {
            addCriterion("bf_five_ball between", value1, value2, "bfFiveBall");
            return (Criteria) this;
        }

        public Criteria andBfFiveBallNotBetween(Integer value1, Integer value2) {
            addCriterion("bf_five_ball not between", value1, value2, "bfFiveBall");
            return (Criteria) this;
        }

        public Criteria andBfSixBallIsNull() {
            addCriterion("bf_six_ball is null");
            return (Criteria) this;
        }

        public Criteria andBfSixBallIsNotNull() {
            addCriterion("bf_six_ball is not null");
            return (Criteria) this;
        }

        public Criteria andBfSixBallEqualTo(Integer value) {
            addCriterion("bf_six_ball =", value, "bfSixBall");
            return (Criteria) this;
        }

        public Criteria andBfSixBallNotEqualTo(Integer value) {
            addCriterion("bf_six_ball <>", value, "bfSixBall");
            return (Criteria) this;
        }

        public Criteria andBfSixBallGreaterThan(Integer value) {
            addCriterion("bf_six_ball >", value, "bfSixBall");
            return (Criteria) this;
        }

        public Criteria andBfSixBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("bf_six_ball >=", value, "bfSixBall");
            return (Criteria) this;
        }

        public Criteria andBfSixBallLessThan(Integer value) {
            addCriterion("bf_six_ball <", value, "bfSixBall");
            return (Criteria) this;
        }

        public Criteria andBfSixBallLessThanOrEqualTo(Integer value) {
            addCriterion("bf_six_ball <=", value, "bfSixBall");
            return (Criteria) this;
        }

        public Criteria andBfSixBallIn(List<Integer> values) {
            addCriterion("bf_six_ball in", values, "bfSixBall");
            return (Criteria) this;
        }

        public Criteria andBfSixBallNotIn(List<Integer> values) {
            addCriterion("bf_six_ball not in", values, "bfSixBall");
            return (Criteria) this;
        }

        public Criteria andBfSixBallBetween(Integer value1, Integer value2) {
            addCriterion("bf_six_ball between", value1, value2, "bfSixBall");
            return (Criteria) this;
        }

        public Criteria andBfSixBallNotBetween(Integer value1, Integer value2) {
            addCriterion("bf_six_ball not between", value1, value2, "bfSixBall");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallIsNull() {
            addCriterion("bf_seven_ball is null");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallIsNotNull() {
            addCriterion("bf_seven_ball is not null");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallEqualTo(Integer value) {
            addCriterion("bf_seven_ball =", value, "bfSevenBall");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallNotEqualTo(Integer value) {
            addCriterion("bf_seven_ball <>", value, "bfSevenBall");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallGreaterThan(Integer value) {
            addCriterion("bf_seven_ball >", value, "bfSevenBall");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("bf_seven_ball >=", value, "bfSevenBall");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallLessThan(Integer value) {
            addCriterion("bf_seven_ball <", value, "bfSevenBall");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallLessThanOrEqualTo(Integer value) {
            addCriterion("bf_seven_ball <=", value, "bfSevenBall");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallIn(List<Integer> values) {
            addCriterion("bf_seven_ball in", values, "bfSevenBall");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallNotIn(List<Integer> values) {
            addCriterion("bf_seven_ball not in", values, "bfSevenBall");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallBetween(Integer value1, Integer value2) {
            addCriterion("bf_seven_ball between", value1, value2, "bfSevenBall");
            return (Criteria) this;
        }

        public Criteria andBfSevenBallNotBetween(Integer value1, Integer value2) {
            addCriterion("bf_seven_ball not between", value1, value2, "bfSevenBall");
            return (Criteria) this;
        }

        public Criteria andBfEightBallIsNull() {
            addCriterion("bf_eight_ball is null");
            return (Criteria) this;
        }

        public Criteria andBfEightBallIsNotNull() {
            addCriterion("bf_eight_ball is not null");
            return (Criteria) this;
        }

        public Criteria andBfEightBallEqualTo(Integer value) {
            addCriterion("bf_eight_ball =", value, "bfEightBall");
            return (Criteria) this;
        }

        public Criteria andBfEightBallNotEqualTo(Integer value) {
            addCriterion("bf_eight_ball <>", value, "bfEightBall");
            return (Criteria) this;
        }

        public Criteria andBfEightBallGreaterThan(Integer value) {
            addCriterion("bf_eight_ball >", value, "bfEightBall");
            return (Criteria) this;
        }

        public Criteria andBfEightBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("bf_eight_ball >=", value, "bfEightBall");
            return (Criteria) this;
        }

        public Criteria andBfEightBallLessThan(Integer value) {
            addCriterion("bf_eight_ball <", value, "bfEightBall");
            return (Criteria) this;
        }

        public Criteria andBfEightBallLessThanOrEqualTo(Integer value) {
            addCriterion("bf_eight_ball <=", value, "bfEightBall");
            return (Criteria) this;
        }

        public Criteria andBfEightBallIn(List<Integer> values) {
            addCriterion("bf_eight_ball in", values, "bfEightBall");
            return (Criteria) this;
        }

        public Criteria andBfEightBallNotIn(List<Integer> values) {
            addCriterion("bf_eight_ball not in", values, "bfEightBall");
            return (Criteria) this;
        }

        public Criteria andBfEightBallBetween(Integer value1, Integer value2) {
            addCriterion("bf_eight_ball between", value1, value2, "bfEightBall");
            return (Criteria) this;
        }

        public Criteria andBfEightBallNotBetween(Integer value1, Integer value2) {
            addCriterion("bf_eight_ball not between", value1, value2, "bfEightBall");
            return (Criteria) this;
        }

        public Criteria andAfOneBallIsNull() {
            addCriterion("af_one_ball is null");
            return (Criteria) this;
        }

        public Criteria andAfOneBallIsNotNull() {
            addCriterion("af_one_ball is not null");
            return (Criteria) this;
        }

        public Criteria andAfOneBallEqualTo(Integer value) {
            addCriterion("af_one_ball =", value, "afOneBall");
            return (Criteria) this;
        }

        public Criteria andAfOneBallNotEqualTo(Integer value) {
            addCriterion("af_one_ball <>", value, "afOneBall");
            return (Criteria) this;
        }

        public Criteria andAfOneBallGreaterThan(Integer value) {
            addCriterion("af_one_ball >", value, "afOneBall");
            return (Criteria) this;
        }

        public Criteria andAfOneBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("af_one_ball >=", value, "afOneBall");
            return (Criteria) this;
        }

        public Criteria andAfOneBallLessThan(Integer value) {
            addCriterion("af_one_ball <", value, "afOneBall");
            return (Criteria) this;
        }

        public Criteria andAfOneBallLessThanOrEqualTo(Integer value) {
            addCriterion("af_one_ball <=", value, "afOneBall");
            return (Criteria) this;
        }

        public Criteria andAfOneBallIn(List<Integer> values) {
            addCriterion("af_one_ball in", values, "afOneBall");
            return (Criteria) this;
        }

        public Criteria andAfOneBallNotIn(List<Integer> values) {
            addCriterion("af_one_ball not in", values, "afOneBall");
            return (Criteria) this;
        }

        public Criteria andAfOneBallBetween(Integer value1, Integer value2) {
            addCriterion("af_one_ball between", value1, value2, "afOneBall");
            return (Criteria) this;
        }

        public Criteria andAfOneBallNotBetween(Integer value1, Integer value2) {
            addCriterion("af_one_ball not between", value1, value2, "afOneBall");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallIsNull() {
            addCriterion("af_two_ball is null");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallIsNotNull() {
            addCriterion("af_two_ball is not null");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallEqualTo(Integer value) {
            addCriterion("af_two_ball =", value, "afTwoBall");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallNotEqualTo(Integer value) {
            addCriterion("af_two_ball <>", value, "afTwoBall");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallGreaterThan(Integer value) {
            addCriterion("af_two_ball >", value, "afTwoBall");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("af_two_ball >=", value, "afTwoBall");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallLessThan(Integer value) {
            addCriterion("af_two_ball <", value, "afTwoBall");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallLessThanOrEqualTo(Integer value) {
            addCriterion("af_two_ball <=", value, "afTwoBall");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallIn(List<Integer> values) {
            addCriterion("af_two_ball in", values, "afTwoBall");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallNotIn(List<Integer> values) {
            addCriterion("af_two_ball not in", values, "afTwoBall");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallBetween(Integer value1, Integer value2) {
            addCriterion("af_two_ball between", value1, value2, "afTwoBall");
            return (Criteria) this;
        }

        public Criteria andAfTwoBallNotBetween(Integer value1, Integer value2) {
            addCriterion("af_two_ball not between", value1, value2, "afTwoBall");
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