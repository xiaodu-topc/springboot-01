create table dept(
 d_id varchar(64) primary key COMMENT "id主键",
 d_name varchar(32) not null comment "部门名称",
 d_parent_no varchar(11) comment "上级部门编号",
 d_no varchar(11) not null UNIQUE comment "部门编号",
 d_head varchar(32) comment "负责人",
 d_zone varchar(11) comment "部门区域代号"

)