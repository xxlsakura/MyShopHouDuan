package com.bean;

import java.util.ArrayList;
import java.util.List;

public class DetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DetailExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSsrc1IsNull() {
            addCriterion("ssrc1 is null");
            return (Criteria) this;
        }

        public Criteria andSsrc1IsNotNull() {
            addCriterion("ssrc1 is not null");
            return (Criteria) this;
        }

        public Criteria andSsrc1EqualTo(String value) {
            addCriterion("ssrc1 =", value, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1NotEqualTo(String value) {
            addCriterion("ssrc1 <>", value, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1GreaterThan(String value) {
            addCriterion("ssrc1 >", value, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1GreaterThanOrEqualTo(String value) {
            addCriterion("ssrc1 >=", value, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1LessThan(String value) {
            addCriterion("ssrc1 <", value, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1LessThanOrEqualTo(String value) {
            addCriterion("ssrc1 <=", value, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1Like(String value) {
            addCriterion("ssrc1 like", value, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1NotLike(String value) {
            addCriterion("ssrc1 not like", value, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1In(List<String> values) {
            addCriterion("ssrc1 in", values, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1NotIn(List<String> values) {
            addCriterion("ssrc1 not in", values, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1Between(String value1, String value2) {
            addCriterion("ssrc1 between", value1, value2, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc1NotBetween(String value1, String value2) {
            addCriterion("ssrc1 not between", value1, value2, "ssrc1");
            return (Criteria) this;
        }

        public Criteria andSsrc2IsNull() {
            addCriterion("ssrc2 is null");
            return (Criteria) this;
        }

        public Criteria andSsrc2IsNotNull() {
            addCriterion("ssrc2 is not null");
            return (Criteria) this;
        }

        public Criteria andSsrc2EqualTo(String value) {
            addCriterion("ssrc2 =", value, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2NotEqualTo(String value) {
            addCriterion("ssrc2 <>", value, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2GreaterThan(String value) {
            addCriterion("ssrc2 >", value, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2GreaterThanOrEqualTo(String value) {
            addCriterion("ssrc2 >=", value, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2LessThan(String value) {
            addCriterion("ssrc2 <", value, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2LessThanOrEqualTo(String value) {
            addCriterion("ssrc2 <=", value, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2Like(String value) {
            addCriterion("ssrc2 like", value, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2NotLike(String value) {
            addCriterion("ssrc2 not like", value, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2In(List<String> values) {
            addCriterion("ssrc2 in", values, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2NotIn(List<String> values) {
            addCriterion("ssrc2 not in", values, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2Between(String value1, String value2) {
            addCriterion("ssrc2 between", value1, value2, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc2NotBetween(String value1, String value2) {
            addCriterion("ssrc2 not between", value1, value2, "ssrc2");
            return (Criteria) this;
        }

        public Criteria andSsrc3IsNull() {
            addCriterion("ssrc3 is null");
            return (Criteria) this;
        }

        public Criteria andSsrc3IsNotNull() {
            addCriterion("ssrc3 is not null");
            return (Criteria) this;
        }

        public Criteria andSsrc3EqualTo(String value) {
            addCriterion("ssrc3 =", value, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3NotEqualTo(String value) {
            addCriterion("ssrc3 <>", value, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3GreaterThan(String value) {
            addCriterion("ssrc3 >", value, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3GreaterThanOrEqualTo(String value) {
            addCriterion("ssrc3 >=", value, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3LessThan(String value) {
            addCriterion("ssrc3 <", value, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3LessThanOrEqualTo(String value) {
            addCriterion("ssrc3 <=", value, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3Like(String value) {
            addCriterion("ssrc3 like", value, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3NotLike(String value) {
            addCriterion("ssrc3 not like", value, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3In(List<String> values) {
            addCriterion("ssrc3 in", values, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3NotIn(List<String> values) {
            addCriterion("ssrc3 not in", values, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3Between(String value1, String value2) {
            addCriterion("ssrc3 between", value1, value2, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andSsrc3NotBetween(String value1, String value2) {
            addCriterion("ssrc3 not between", value1, value2, "ssrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc1IsNull() {
            addCriterion("dsrc1 is null");
            return (Criteria) this;
        }

        public Criteria andDsrc1IsNotNull() {
            addCriterion("dsrc1 is not null");
            return (Criteria) this;
        }

        public Criteria andDsrc1EqualTo(String value) {
            addCriterion("dsrc1 =", value, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1NotEqualTo(String value) {
            addCriterion("dsrc1 <>", value, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1GreaterThan(String value) {
            addCriterion("dsrc1 >", value, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1GreaterThanOrEqualTo(String value) {
            addCriterion("dsrc1 >=", value, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1LessThan(String value) {
            addCriterion("dsrc1 <", value, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1LessThanOrEqualTo(String value) {
            addCriterion("dsrc1 <=", value, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1Like(String value) {
            addCriterion("dsrc1 like", value, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1NotLike(String value) {
            addCriterion("dsrc1 not like", value, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1In(List<String> values) {
            addCriterion("dsrc1 in", values, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1NotIn(List<String> values) {
            addCriterion("dsrc1 not in", values, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1Between(String value1, String value2) {
            addCriterion("dsrc1 between", value1, value2, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc1NotBetween(String value1, String value2) {
            addCriterion("dsrc1 not between", value1, value2, "dsrc1");
            return (Criteria) this;
        }

        public Criteria andDsrc2IsNull() {
            addCriterion("dsrc2 is null");
            return (Criteria) this;
        }

        public Criteria andDsrc2IsNotNull() {
            addCriterion("dsrc2 is not null");
            return (Criteria) this;
        }

        public Criteria andDsrc2EqualTo(String value) {
            addCriterion("dsrc2 =", value, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2NotEqualTo(String value) {
            addCriterion("dsrc2 <>", value, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2GreaterThan(String value) {
            addCriterion("dsrc2 >", value, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2GreaterThanOrEqualTo(String value) {
            addCriterion("dsrc2 >=", value, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2LessThan(String value) {
            addCriterion("dsrc2 <", value, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2LessThanOrEqualTo(String value) {
            addCriterion("dsrc2 <=", value, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2Like(String value) {
            addCriterion("dsrc2 like", value, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2NotLike(String value) {
            addCriterion("dsrc2 not like", value, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2In(List<String> values) {
            addCriterion("dsrc2 in", values, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2NotIn(List<String> values) {
            addCriterion("dsrc2 not in", values, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2Between(String value1, String value2) {
            addCriterion("dsrc2 between", value1, value2, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc2NotBetween(String value1, String value2) {
            addCriterion("dsrc2 not between", value1, value2, "dsrc2");
            return (Criteria) this;
        }

        public Criteria andDsrc3IsNull() {
            addCriterion("dsrc3 is null");
            return (Criteria) this;
        }

        public Criteria andDsrc3IsNotNull() {
            addCriterion("dsrc3 is not null");
            return (Criteria) this;
        }

        public Criteria andDsrc3EqualTo(String value) {
            addCriterion("dsrc3 =", value, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3NotEqualTo(String value) {
            addCriterion("dsrc3 <>", value, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3GreaterThan(String value) {
            addCriterion("dsrc3 >", value, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3GreaterThanOrEqualTo(String value) {
            addCriterion("dsrc3 >=", value, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3LessThan(String value) {
            addCriterion("dsrc3 <", value, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3LessThanOrEqualTo(String value) {
            addCriterion("dsrc3 <=", value, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3Like(String value) {
            addCriterion("dsrc3 like", value, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3NotLike(String value) {
            addCriterion("dsrc3 not like", value, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3In(List<String> values) {
            addCriterion("dsrc3 in", values, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3NotIn(List<String> values) {
            addCriterion("dsrc3 not in", values, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3Between(String value1, String value2) {
            addCriterion("dsrc3 between", value1, value2, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andDsrc3NotBetween(String value1, String value2) {
            addCriterion("dsrc3 not between", value1, value2, "dsrc3");
            return (Criteria) this;
        }

        public Criteria andVsrcIsNull() {
            addCriterion("vsrc is null");
            return (Criteria) this;
        }

        public Criteria andVsrcIsNotNull() {
            addCriterion("vsrc is not null");
            return (Criteria) this;
        }

        public Criteria andVsrcEqualTo(String value) {
            addCriterion("vsrc =", value, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcNotEqualTo(String value) {
            addCriterion("vsrc <>", value, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcGreaterThan(String value) {
            addCriterion("vsrc >", value, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcGreaterThanOrEqualTo(String value) {
            addCriterion("vsrc >=", value, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcLessThan(String value) {
            addCriterion("vsrc <", value, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcLessThanOrEqualTo(String value) {
            addCriterion("vsrc <=", value, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcLike(String value) {
            addCriterion("vsrc like", value, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcNotLike(String value) {
            addCriterion("vsrc not like", value, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcIn(List<String> values) {
            addCriterion("vsrc in", values, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcNotIn(List<String> values) {
            addCriterion("vsrc not in", values, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcBetween(String value1, String value2) {
            addCriterion("vsrc between", value1, value2, "vsrc");
            return (Criteria) this;
        }

        public Criteria andVsrcNotBetween(String value1, String value2) {
            addCriterion("vsrc not between", value1, value2, "vsrc");
            return (Criteria) this;
        }
    }

    /**
     */
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