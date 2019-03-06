package com.ball.doubleball.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuessRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuessRecordExample() {
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

        public Criteria andRedBallListIsNull() {
            addCriterion("red_ball_list is null");
            return (Criteria) this;
        }

        public Criteria andRedBallListIsNotNull() {
            addCriterion("red_ball_list is not null");
            return (Criteria) this;
        }

        public Criteria andRedBallListEqualTo(String value) {
            addCriterion("red_ball_list =", value, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListNotEqualTo(String value) {
            addCriterion("red_ball_list <>", value, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListGreaterThan(String value) {
            addCriterion("red_ball_list >", value, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListGreaterThanOrEqualTo(String value) {
            addCriterion("red_ball_list >=", value, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListLessThan(String value) {
            addCriterion("red_ball_list <", value, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListLessThanOrEqualTo(String value) {
            addCriterion("red_ball_list <=", value, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListLike(String value) {
            addCriterion("red_ball_list like", value, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListNotLike(String value) {
            addCriterion("red_ball_list not like", value, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListIn(List<String> values) {
            addCriterion("red_ball_list in", values, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListNotIn(List<String> values) {
            addCriterion("red_ball_list not in", values, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListBetween(String value1, String value2) {
            addCriterion("red_ball_list between", value1, value2, "redBallList");
            return (Criteria) this;
        }

        public Criteria andRedBallListNotBetween(String value1, String value2) {
            addCriterion("red_ball_list not between", value1, value2, "redBallList");
            return (Criteria) this;
        }

        public Criteria andBlueBallIsNull() {
            addCriterion("blue_ball is null");
            return (Criteria) this;
        }

        public Criteria andBlueBallIsNotNull() {
            addCriterion("blue_ball is not null");
            return (Criteria) this;
        }

        public Criteria andBlueBallEqualTo(Integer value) {
            addCriterion("blue_ball =", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallNotEqualTo(Integer value) {
            addCriterion("blue_ball <>", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallGreaterThan(Integer value) {
            addCriterion("blue_ball >", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallGreaterThanOrEqualTo(Integer value) {
            addCriterion("blue_ball >=", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallLessThan(Integer value) {
            addCriterion("blue_ball <", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallLessThanOrEqualTo(Integer value) {
            addCriterion("blue_ball <=", value, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallIn(List<Integer> values) {
            addCriterion("blue_ball in", values, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallNotIn(List<Integer> values) {
            addCriterion("blue_ball not in", values, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallBetween(Integer value1, Integer value2) {
            addCriterion("blue_ball between", value1, value2, "blueBall");
            return (Criteria) this;
        }

        public Criteria andBlueBallNotBetween(Integer value1, Integer value2) {
            addCriterion("blue_ball not between", value1, value2, "blueBall");
            return (Criteria) this;
        }

        public Criteria andHaveWinIsNull() {
            addCriterion("have_win is null");
            return (Criteria) this;
        }

        public Criteria andHaveWinIsNotNull() {
            addCriterion("have_win is not null");
            return (Criteria) this;
        }

        public Criteria andHaveWinEqualTo(Byte value) {
            addCriterion("have_win =", value, "haveWin");
            return (Criteria) this;
        }

        public Criteria andHaveWinNotEqualTo(Byte value) {
            addCriterion("have_win <>", value, "haveWin");
            return (Criteria) this;
        }

        public Criteria andHaveWinGreaterThan(Byte value) {
            addCriterion("have_win >", value, "haveWin");
            return (Criteria) this;
        }

        public Criteria andHaveWinGreaterThanOrEqualTo(Byte value) {
            addCriterion("have_win >=", value, "haveWin");
            return (Criteria) this;
        }

        public Criteria andHaveWinLessThan(Byte value) {
            addCriterion("have_win <", value, "haveWin");
            return (Criteria) this;
        }

        public Criteria andHaveWinLessThanOrEqualTo(Byte value) {
            addCriterion("have_win <=", value, "haveWin");
            return (Criteria) this;
        }

        public Criteria andHaveWinIn(List<Byte> values) {
            addCriterion("have_win in", values, "haveWin");
            return (Criteria) this;
        }

        public Criteria andHaveWinNotIn(List<Byte> values) {
            addCriterion("have_win not in", values, "haveWin");
            return (Criteria) this;
        }

        public Criteria andHaveWinBetween(Byte value1, Byte value2) {
            addCriterion("have_win between", value1, value2, "haveWin");
            return (Criteria) this;
        }

        public Criteria andHaveWinNotBetween(Byte value1, Byte value2) {
            addCriterion("have_win not between", value1, value2, "haveWin");
            return (Criteria) this;
        }

        public Criteria andWinLevelIsNull() {
            addCriterion("win_level is null");
            return (Criteria) this;
        }

        public Criteria andWinLevelIsNotNull() {
            addCriterion("win_level is not null");
            return (Criteria) this;
        }

        public Criteria andWinLevelEqualTo(Byte value) {
            addCriterion("win_level =", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelNotEqualTo(Byte value) {
            addCriterion("win_level <>", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelGreaterThan(Byte value) {
            addCriterion("win_level >", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("win_level >=", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelLessThan(Byte value) {
            addCriterion("win_level <", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelLessThanOrEqualTo(Byte value) {
            addCriterion("win_level <=", value, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelIn(List<Byte> values) {
            addCriterion("win_level in", values, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelNotIn(List<Byte> values) {
            addCriterion("win_level not in", values, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelBetween(Byte value1, Byte value2) {
            addCriterion("win_level between", value1, value2, "winLevel");
            return (Criteria) this;
        }

        public Criteria andWinLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("win_level not between", value1, value2, "winLevel");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andAuthorNameIsNull() {
            addCriterion("author_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNotNull() {
            addCriterion("author_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("author_name =", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("author_name <>", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("author_name >", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("author_name >=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("author_name <", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("author_name <=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLike(String value) {
            addCriterion("author_name like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotLike(String value) {
            addCriterion("author_name not like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIn(List<String> values) {
            addCriterion("author_name in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotIn(List<String> values) {
            addCriterion("author_name not in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("author_name between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("author_name not between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdIsNull() {
            addCriterion("algorithm_id is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdIsNotNull() {
            addCriterion("algorithm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdEqualTo(Integer value) {
            addCriterion("algorithm_id =", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdNotEqualTo(Integer value) {
            addCriterion("algorithm_id <>", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdGreaterThan(Integer value) {
            addCriterion("algorithm_id >", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("algorithm_id >=", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdLessThan(Integer value) {
            addCriterion("algorithm_id <", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdLessThanOrEqualTo(Integer value) {
            addCriterion("algorithm_id <=", value, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdIn(List<Integer> values) {
            addCriterion("algorithm_id in", values, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdNotIn(List<Integer> values) {
            addCriterion("algorithm_id not in", values, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdBetween(Integer value1, Integer value2) {
            addCriterion("algorithm_id between", value1, value2, "algorithmId");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("algorithm_id not between", value1, value2, "algorithmId");
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