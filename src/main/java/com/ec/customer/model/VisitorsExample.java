package com.ec.customer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VisitorsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table visitors
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table visitors
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table visitors
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
     */
    public VisitorsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
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
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visitors
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table visitors
     *
     * @mbg.generated
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

        public Criteria andCustomTypeIsNull() {
            addCriterion("custom_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIsNotNull() {
            addCriterion("custom_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomTypeEqualTo(Integer value) {
            addCriterion("custom_type =", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotEqualTo(Integer value) {
            addCriterion("custom_type <>", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeGreaterThan(Integer value) {
            addCriterion("custom_type >", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_type >=", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLessThan(Integer value) {
            addCriterion("custom_type <", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLessThanOrEqualTo(Integer value) {
            addCriterion("custom_type <=", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIn(List<Integer> values) {
            addCriterion("custom_type in", values, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotIn(List<Integer> values) {
            addCriterion("custom_type not in", values, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeBetween(Integer value1, Integer value2) {
            addCriterion("custom_type between", value1, value2, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_type not between", value1, value2, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomFromIsNull() {
            addCriterion("custom_from is null");
            return (Criteria) this;
        }

        public Criteria andCustomFromIsNotNull() {
            addCriterion("custom_from is not null");
            return (Criteria) this;
        }

        public Criteria andCustomFromEqualTo(String value) {
            addCriterion("custom_from =", value, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromNotEqualTo(String value) {
            addCriterion("custom_from <>", value, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromGreaterThan(String value) {
            addCriterion("custom_from >", value, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromGreaterThanOrEqualTo(String value) {
            addCriterion("custom_from >=", value, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromLessThan(String value) {
            addCriterion("custom_from <", value, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromLessThanOrEqualTo(String value) {
            addCriterion("custom_from <=", value, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromLike(String value) {
            addCriterion("custom_from like", value, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromNotLike(String value) {
            addCriterion("custom_from not like", value, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromIn(List<String> values) {
            addCriterion("custom_from in", values, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromNotIn(List<String> values) {
            addCriterion("custom_from not in", values, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromBetween(String value1, String value2) {
            addCriterion("custom_from between", value1, value2, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomFromNotBetween(String value1, String value2) {
            addCriterion("custom_from not between", value1, value2, "customFrom");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlIsNull() {
            addCriterion("custom_visit_url is null");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlIsNotNull() {
            addCriterion("custom_visit_url is not null");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlEqualTo(String value) {
            addCriterion("custom_visit_url =", value, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlNotEqualTo(String value) {
            addCriterion("custom_visit_url <>", value, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlGreaterThan(String value) {
            addCriterion("custom_visit_url >", value, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("custom_visit_url >=", value, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlLessThan(String value) {
            addCriterion("custom_visit_url <", value, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlLessThanOrEqualTo(String value) {
            addCriterion("custom_visit_url <=", value, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlLike(String value) {
            addCriterion("custom_visit_url like", value, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlNotLike(String value) {
            addCriterion("custom_visit_url not like", value, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlIn(List<String> values) {
            addCriterion("custom_visit_url in", values, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlNotIn(List<String> values) {
            addCriterion("custom_visit_url not in", values, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlBetween(String value1, String value2) {
            addCriterion("custom_visit_url between", value1, value2, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andCustomVisitUrlNotBetween(String value1, String value2) {
            addCriterion("custom_visit_url not between", value1, value2, "customVisitUrl");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreateipIsNull() {
            addCriterion("createip is null");
            return (Criteria) this;
        }

        public Criteria andCreateipIsNotNull() {
            addCriterion("createip is not null");
            return (Criteria) this;
        }

        public Criteria andCreateipEqualTo(String value) {
            addCriterion("createip =", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipNotEqualTo(String value) {
            addCriterion("createip <>", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipGreaterThan(String value) {
            addCriterion("createip >", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipGreaterThanOrEqualTo(String value) {
            addCriterion("createip >=", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipLessThan(String value) {
            addCriterion("createip <", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipLessThanOrEqualTo(String value) {
            addCriterion("createip <=", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipLike(String value) {
            addCriterion("createip like", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipNotLike(String value) {
            addCriterion("createip not like", value, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipIn(List<String> values) {
            addCriterion("createip in", values, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipNotIn(List<String> values) {
            addCriterion("createip not in", values, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipBetween(String value1, String value2) {
            addCriterion("createip between", value1, value2, "createip");
            return (Criteria) this;
        }

        public Criteria andCreateipNotBetween(String value1, String value2) {
            addCriterion("createip not between", value1, value2, "createip");
            return (Criteria) this;
        }

        public Criteria andBrowserNameIsNull() {
            addCriterion("browser_name is null");
            return (Criteria) this;
        }

        public Criteria andBrowserNameIsNotNull() {
            addCriterion("browser_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserNameEqualTo(String value) {
            addCriterion("browser_name =", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameNotEqualTo(String value) {
            addCriterion("browser_name <>", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameGreaterThan(String value) {
            addCriterion("browser_name >", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameGreaterThanOrEqualTo(String value) {
            addCriterion("browser_name >=", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameLessThan(String value) {
            addCriterion("browser_name <", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameLessThanOrEqualTo(String value) {
            addCriterion("browser_name <=", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameLike(String value) {
            addCriterion("browser_name like", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameNotLike(String value) {
            addCriterion("browser_name not like", value, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameIn(List<String> values) {
            addCriterion("browser_name in", values, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameNotIn(List<String> values) {
            addCriterion("browser_name not in", values, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameBetween(String value1, String value2) {
            addCriterion("browser_name between", value1, value2, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserNameNotBetween(String value1, String value2) {
            addCriterion("browser_name not between", value1, value2, "browserName");
            return (Criteria) this;
        }

        public Criteria andBrowserOsIsNull() {
            addCriterion("browser_os is null");
            return (Criteria) this;
        }

        public Criteria andBrowserOsIsNotNull() {
            addCriterion("browser_os is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserOsEqualTo(String value) {
            addCriterion("browser_os =", value, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsNotEqualTo(String value) {
            addCriterion("browser_os <>", value, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsGreaterThan(String value) {
            addCriterion("browser_os >", value, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsGreaterThanOrEqualTo(String value) {
            addCriterion("browser_os >=", value, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsLessThan(String value) {
            addCriterion("browser_os <", value, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsLessThanOrEqualTo(String value) {
            addCriterion("browser_os <=", value, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsLike(String value) {
            addCriterion("browser_os like", value, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsNotLike(String value) {
            addCriterion("browser_os not like", value, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsIn(List<String> values) {
            addCriterion("browser_os in", values, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsNotIn(List<String> values) {
            addCriterion("browser_os not in", values, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsBetween(String value1, String value2) {
            addCriterion("browser_os between", value1, value2, "browserOs");
            return (Criteria) this;
        }

        public Criteria andBrowserOsNotBetween(String value1, String value2) {
            addCriterion("browser_os not between", value1, value2, "browserOs");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRateUnitIsNull() {
            addCriterion("rate_unit is null");
            return (Criteria) this;
        }

        public Criteria andRateUnitIsNotNull() {
            addCriterion("rate_unit is not null");
            return (Criteria) this;
        }

        public Criteria andRateUnitEqualTo(String value) {
            addCriterion("rate_unit =", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitNotEqualTo(String value) {
            addCriterion("rate_unit <>", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitGreaterThan(String value) {
            addCriterion("rate_unit >", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitGreaterThanOrEqualTo(String value) {
            addCriterion("rate_unit >=", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitLessThan(String value) {
            addCriterion("rate_unit <", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitLessThanOrEqualTo(String value) {
            addCriterion("rate_unit <=", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitLike(String value) {
            addCriterion("rate_unit like", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitNotLike(String value) {
            addCriterion("rate_unit not like", value, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitIn(List<String> values) {
            addCriterion("rate_unit in", values, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitNotIn(List<String> values) {
            addCriterion("rate_unit not in", values, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitBetween(String value1, String value2) {
            addCriterion("rate_unit between", value1, value2, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateUnitNotBetween(String value1, String value2) {
            addCriterion("rate_unit not between", value1, value2, "rateUnit");
            return (Criteria) this;
        }

        public Criteria andRateValIsNull() {
            addCriterion("rate_val is null");
            return (Criteria) this;
        }

        public Criteria andRateValIsNotNull() {
            addCriterion("rate_val is not null");
            return (Criteria) this;
        }

        public Criteria andRateValEqualTo(Integer value) {
            addCriterion("rate_val =", value, "rateVal");
            return (Criteria) this;
        }

        public Criteria andRateValNotEqualTo(Integer value) {
            addCriterion("rate_val <>", value, "rateVal");
            return (Criteria) this;
        }

        public Criteria andRateValGreaterThan(Integer value) {
            addCriterion("rate_val >", value, "rateVal");
            return (Criteria) this;
        }

        public Criteria andRateValGreaterThanOrEqualTo(Integer value) {
            addCriterion("rate_val >=", value, "rateVal");
            return (Criteria) this;
        }

        public Criteria andRateValLessThan(Integer value) {
            addCriterion("rate_val <", value, "rateVal");
            return (Criteria) this;
        }

        public Criteria andRateValLessThanOrEqualTo(Integer value) {
            addCriterion("rate_val <=", value, "rateVal");
            return (Criteria) this;
        }

        public Criteria andRateValIn(List<Integer> values) {
            addCriterion("rate_val in", values, "rateVal");
            return (Criteria) this;
        }

        public Criteria andRateValNotIn(List<Integer> values) {
            addCriterion("rate_val not in", values, "rateVal");
            return (Criteria) this;
        }

        public Criteria andRateValBetween(Integer value1, Integer value2) {
            addCriterion("rate_val between", value1, value2, "rateVal");
            return (Criteria) this;
        }

        public Criteria andRateValNotBetween(Integer value1, Integer value2) {
            addCriterion("rate_val not between", value1, value2, "rateVal");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table visitors
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table visitors
     *
     * @mbg.generated
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