package com.yanda.core.entity.generated;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttachmentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttachmentInfoExample() {
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

        public Criteria andAppendixIdIsNull() {
            addCriterion("appendix_id is null");
            return (Criteria) this;
        }

        public Criteria andAppendixIdIsNotNull() {
            addCriterion("appendix_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppendixIdEqualTo(Long value) {
            addCriterion("appendix_id =", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotEqualTo(Long value) {
            addCriterion("appendix_id <>", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdGreaterThan(Long value) {
            addCriterion("appendix_id >", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdGreaterThanOrEqualTo(Long value) {
            addCriterion("appendix_id >=", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdLessThan(Long value) {
            addCriterion("appendix_id <", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdLessThanOrEqualTo(Long value) {
            addCriterion("appendix_id <=", value, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdIn(List<Long> values) {
            addCriterion("appendix_id in", values, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotIn(List<Long> values) {
            addCriterion("appendix_id not in", values, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdBetween(Long value1, Long value2) {
            addCriterion("appendix_id between", value1, value2, "appendixId");
            return (Criteria) this;
        }

        public Criteria andAppendixIdNotBetween(Long value1, Long value2) {
            addCriterion("appendix_id not between", value1, value2, "appendixId");
            return (Criteria) this;
        }

        public Criteria andOldFilenameIsNull() {
            addCriterion("old_filename is null");
            return (Criteria) this;
        }

        public Criteria andOldFilenameIsNotNull() {
            addCriterion("old_filename is not null");
            return (Criteria) this;
        }

        public Criteria andOldFilenameEqualTo(String value) {
            addCriterion("old_filename =", value, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameNotEqualTo(String value) {
            addCriterion("old_filename <>", value, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameGreaterThan(String value) {
            addCriterion("old_filename >", value, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("old_filename >=", value, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameLessThan(String value) {
            addCriterion("old_filename <", value, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameLessThanOrEqualTo(String value) {
            addCriterion("old_filename <=", value, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameLike(String value) {
            addCriterion("old_filename like", value, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameNotLike(String value) {
            addCriterion("old_filename not like", value, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameIn(List<String> values) {
            addCriterion("old_filename in", values, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameNotIn(List<String> values) {
            addCriterion("old_filename not in", values, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameBetween(String value1, String value2) {
            addCriterion("old_filename between", value1, value2, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andOldFilenameNotBetween(String value1, String value2) {
            addCriterion("old_filename not between", value1, value2, "oldFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameIsNull() {
            addCriterion("new_filename is null");
            return (Criteria) this;
        }

        public Criteria andNewFilenameIsNotNull() {
            addCriterion("new_filename is not null");
            return (Criteria) this;
        }

        public Criteria andNewFilenameEqualTo(String value) {
            addCriterion("new_filename =", value, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameNotEqualTo(String value) {
            addCriterion("new_filename <>", value, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameGreaterThan(String value) {
            addCriterion("new_filename >", value, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("new_filename >=", value, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameLessThan(String value) {
            addCriterion("new_filename <", value, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameLessThanOrEqualTo(String value) {
            addCriterion("new_filename <=", value, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameLike(String value) {
            addCriterion("new_filename like", value, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameNotLike(String value) {
            addCriterion("new_filename not like", value, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameIn(List<String> values) {
            addCriterion("new_filename in", values, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameNotIn(List<String> values) {
            addCriterion("new_filename not in", values, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameBetween(String value1, String value2) {
            addCriterion("new_filename between", value1, value2, "newFilename");
            return (Criteria) this;
        }

        public Criteria andNewFilenameNotBetween(String value1, String value2) {
            addCriterion("new_filename not between", value1, value2, "newFilename");
            return (Criteria) this;
        }

        public Criteria andFileExtIsNull() {
            addCriterion("file_ext is null");
            return (Criteria) this;
        }

        public Criteria andFileExtIsNotNull() {
            addCriterion("file_ext is not null");
            return (Criteria) this;
        }

        public Criteria andFileExtEqualTo(String value) {
            addCriterion("file_ext =", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotEqualTo(String value) {
            addCriterion("file_ext <>", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtGreaterThan(String value) {
            addCriterion("file_ext >", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtGreaterThanOrEqualTo(String value) {
            addCriterion("file_ext >=", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLessThan(String value) {
            addCriterion("file_ext <", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLessThanOrEqualTo(String value) {
            addCriterion("file_ext <=", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtLike(String value) {
            addCriterion("file_ext like", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotLike(String value) {
            addCriterion("file_ext not like", value, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtIn(List<String> values) {
            addCriterion("file_ext in", values, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotIn(List<String> values) {
            addCriterion("file_ext not in", values, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtBetween(String value1, String value2) {
            addCriterion("file_ext between", value1, value2, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFileExtNotBetween(String value1, String value2) {
            addCriterion("file_ext not between", value1, value2, "fileExt");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(Integer value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(Integer value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(Integer value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(Integer value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(Integer value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<Integer> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<Integer> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(Integer value1, Integer value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
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

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Long value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Long value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Long value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Long value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Long value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Long> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Long> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Long value1, Long value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Long value1, Long value2) {
            addCriterion("duration not between", value1, value2, "duration");
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