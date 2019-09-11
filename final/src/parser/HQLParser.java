package parser;// Generated from C:/Users/muzna/Desktop/4th/compiler/final/src\HQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T_ACTION=5, T_ADD2=6, T_ALL=7, T_ALLOCATE=8, 
		T_ALTER=9, T_AND=10, T_ANSI_NULLS=11, T_ANSI_PADDING=12, T_AS=13, T_ASC=14, 
		T_ASSOCIATE=15, T_AT=16, T_AUTO_INCREMENT=17, T_AVG=18, T_BATCHSIZE=19, 
		T_BEGIN=20, T_BETWEEN=21, T_BIGINT=22, T_BINARY_DOUBLE=23, T_BINARY_FLOAT=24, 
		T_BINARY_INTEGER=25, T_BIT=26, T_BODY=27, T_BREAK=28, T_BY=29, T_BYTE=30, 
		T_CALL=31, T_CALLER=32, T_CASCADE=33, T_CASE=34, T_CASESPECIFIC=35, T_CAST=36, 
		T_CHAR=37, T_CHARACTER=38, T_CHARSET=39, T_CLIENT=40, T_CLOSE=41, T_CLUSTERED=42, 
		T_CMP=43, T_COLLECT=44, T_COLLECTION=45, T_COLUMN=46, T_COMMENT=47, T_CONSTANT=48, 
		T_COMMIT=49, T_COMPRESS=50, T_CONCAT=51, T_CONDITION=52, T_CONSTRAINT=53, 
		T_CONTINUE=54, T_COPY=55, T_COUNT=56, T_COUNT_BIG=57, T_CREATE=58, T_CREATION=59, 
		T_CREATOR=60, T_CS=61, T_CURRENT=62, T_CURRENT_SCHEMA=63, T_CURSOR=64, 
		T_DATABASE=65, T_DATA=66, T_DATE=67, T_DATETIME=68, T_DAY=69, T_DAYS=70, 
		T_DEC=71, T_DECIMAL=72, T_DECLARE=73, T_DEFAULT=74, T_DEFERRED=75, T_DEFINED=76, 
		T_DEFINER=77, T_DEFINITION=78, T_DELETE=79, T_DELIMITED=80, T_DELIMITER=81, 
		T_DESC=82, T_DESCRIBE=83, T_DIAGNOSTICS=84, T_DIR=85, T_DIRECTORY=86, 
		T_DISTINCT=87, T_DISTRIBUTE=88, T_DO=89, T_DOUBLE=90, T_DROP=91, T_DYNAMIC=92, 
		T_ELSE=93, T_ELSEIF=94, T_ELSIF=95, T_ENABLE=96, T_END=97, T_ENGINE=98, 
		T_ESCAPED=99, T_EXCEPT=100, T_EXEC=101, T_EXECUTE=102, T_EXCEPTION=103, 
		T_EXCLUSIVE=104, T_EXISTS=105, T_EXIT=106, T_EXTERNAL=107, T_FALLBACK=108, 
		T_FALSE=109, T_FETCH=110, T_FIELDS=111, T_FILE=112, T_FILES=113, T_FLOAT=114, 
		T_FOR=115, T_FOREIGN=116, T_FORMAT=117, T_FOUND=118, T_FROM=119, T_FULL=120, 
		T_FUNCTION=121, T_GET=122, T_GLOBAL=123, T_GO=124, T_GRANT=125, T_GROUP=126, 
		T_HANDLER=127, T_HASH=128, T_HAVING=129, T_HDFS=130, T_HIVE=131, T_HOST=132, 
		T_IDENTITY=133, T_IF=134, T_IGNORE=135, T_IMMEDIATE=136, T_IN=137, T_INCLUDE=138, 
		T_INDEX=139, T_INITRANS=140, T_INNER=141, T_INOUT=142, T_INSERT=143, T_INT=144, 
		T_INT2=145, T_INT4=146, T_INT8=147, T_INTEGER=148, T_INTERSECT=149, T_INTERVAL=150, 
		T_INTO=151, T_INVOKER=152, T_IS=153, T_ISOPEN=154, T_ITEMS=155, T_JOIN=156, 
		T_KEEP=157, T_KEY=158, T_KEYS=159, T_LANGUAGE=160, T_LEAVE=161, T_LEFT=162, 
		T_LIKE=163, T_LIMIT=164, T_LINES=165, T_LOCAL=166, T_LOCATION=167, T_LOCATOR=168, 
		T_LOCATORS=169, T_LOCKS=170, T_LOG=171, T_LOGGED=172, T_LOGGING=173, T_LOOP=174, 
		T_MAP=175, T_MATCHED=176, T_MAX=177, T_MAXTRANS=178, T_MERGE=179, T_MESSAGE_TEXT=180, 
		T_MICROSECOND=181, T_MICROSECONDS=182, T_MIN=183, T_MULTISET=184, T_NCHAR=185, 
		T_NEW=186, T_NVARCHAR=187, T_NO=188, T_NOCOUNT=189, T_NOCOMPRESS=190, 
		T_NOLOGGING=191, T_NONE=192, T_NOT=193, T_NOTFOUND=194, T_NULL=195, T_NUMERIC=196, 
		T_NUMBER=197, T_OBJECT=198, T_OFF=199, T_ON=200, T_ONLY=201, T_OPEN=202, 
		T_OR=203, T_ORDER=204, T_OUT=205, T_OUTER=206, T_OVER=207, T_OVERWRITE=208, 
		T_OWNER=209, T_PACKAGE=210, T_PARTITION=211, T_PCTFREE=212, T_PCTUSED=213, 
		T_PLS_INTEGER=214, T_PRECISION=215, T_PRESERVE=216, T_PRIMARY=217, T_PRINT=218, 
		T_PROC=219, T_PROCEDURE=220, T_QUALIFY=221, T_QUERY_BAND=222, T_QUIT=223, 
		T_QUOTED_IDENTIFIER=224, T_RAISE=225, T_REAL=226, T_REFERENCES=227, T_REGEXP=228, 
		T_REPLACE=229, T_RESIGNAL=230, T_RESTRICT=231, T_RESULT=232, T_RESULT_SET_LOCATOR=233, 
		T_RETURN=234, T_RETURNS=235, T_REVERSE=236, T_RIGHT=237, T_RLIKE=238, 
		T_ROLE=239, T_ROLLBACK=240, T_ROW=241, T_ROWS=242, T_ROWTYPE=243, T_ROW_COUNT=244, 
		T_RR=245, T_RS=246, T_PWD=247, T_TRIM=248, T_SCHEMA=249, T_SECOND=250, 
		T_SECONDS=251, T_SECURITY=252, T_SEGMENT=253, T_SEL=254, T_SELECT=255, 
		T_SET=256, T_SESSION=257, T_SESSIONS=258, T_SETS=259, T_SHARE=260, T_SIGNAL=261, 
		T_SIMPLE_DOUBLE=262, T_SIMPLE_FLOAT=263, T_SIMPLE_INTEGER=264, T_SMALLDATETIME=265, 
		T_SMALLINT=266, T_SQL=267, T_SQLEXCEPTION=268, T_SQLINSERT=269, T_SQLSTATE=270, 
		T_SQLWARNING=271, T_STATS=272, T_STATISTICS=273, T_STEP=274, T_STORAGE=275, 
		T_STORED=276, T_STRING=277, T_SUBDIR=278, T_SUBSTRING=279, T_SUM=280, 
		T_SUMMARY=281, T_SYS_REFCURSOR=282, T_TABLE=283, T_TABLESPACE=284, T_TEMPORARY=285, 
		T_TERMINATED=286, T_TEXTIMAGE_ON=287, T_THEN=288, T_TIMESTAMP=289, T_TINYINT=290, 
		T_TITLE=291, T_TO=292, T_TOP=293, T_TRANSACTION=294, T_TRUE=295, T_TRUNCATE=296, 
		T_TYPE=297, T_UNION=298, T_UNIQUE=299, T_UPDATE=300, T_UR=301, T_USE=302, 
		T_USING=303, T_VALUE=304, T_VALUES=305, T_VAR=306, T_VARCHAR=307, T_VARCHAR2=308, 
		T_VARYING=309, T_VOLATILE=310, T_WHEN=311, T_WHERE=312, T_WHILE=313, T_WITH=314, 
		T_WITHOUT=315, T_WORK=316, T_XACT_ABORT=317, T_XML=318, T_YES=319, T_ACTIVITY_COUNT=320, 
		T_CUME_DIST=321, T_CURRENT_DATE=322, T_CURRENT_TIMESTAMP=323, T_CURRENT_USER=324, 
		T_DENSE_RANK=325, T_FIRST_VALUE=326, T_LAG=327, T_LAST_VALUE=328, T_LEAD=329, 
		T_MAX_PART_STRING=330, T_MIN_PART_STRING=331, T_MAX_PART_INT=332, T_MIN_PART_INT=333, 
		T_MAX_PART_DATE=334, T_MIN_PART_DATE=335, T_PART_COUNT=336, T_PART_LOC=337, 
		T_RANK=338, T_ROW_NUMBER=339, T_STDEV=340, T_SYSDATE=341, T_VARIANCE=342, 
		T_USER=343, T_ADD=344, T_COLON=345, T_COMMA=346, T_PIPE=347, T_DIV=348, 
		T_DOT2=349, T_EQUAL=350, T_EQUAL2=351, T_NOTEQUAL=352, T_NOTEQUAL2=353, 
		T_GREATER=354, T_GREATEREQUAL=355, T_LESS=356, T_LESSEQUAL=357, T_MUL=358, 
		T_OPEN_B=359, T_OPEN_P=360, T_OPEN_SB=361, T_CLOSE_B=362, T_CLOSE_P=363, 
		T_CLOSE_SB=364, T_SEMICOLON=365, T_SUB=366, L_CHAR=367, L_ID=368, L_S_STRING=369, 
		L_D_STRING=370, L_INT=371, L_DEC=372, L_WS=373, L_M_COMMENT=374, L_S_COMMENT=375, 
		L_FILE=376, L_LABEL=377, NOT=378;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_semicolon_stmt = 6, RULE_stmt = 7, 
		RULE_exception_block = 8, RULE_exception_block_item = 9, RULE_null_stmt = 10, 
		RULE_expr_stmt = 11, RULE_assignment_stmt = 12, RULE_assignment_stmt_item = 13, 
		RULE_assignment_stmt_single_item = 14, RULE_assignment_stmt_multiple_item = 15, 
		RULE_assignment_stmt_select_item = 16, RULE_declare_block = 17, RULE_declare_block_inplace = 18, 
		RULE_declare_stmt_item = 19, RULE_declare_var_item = 20, RULE_declare_condition_item = 21, 
		RULE_declare_cursor_item = 22, RULE_cursor_with_return = 23, RULE_cursor_without_return = 24, 
		RULE_declare_handler_item = 25, RULE_declare_temporary_table_item = 26, 
		RULE_create_table_stmt = 27, RULE_delm = 28, RULE_location = 29, RULE_create_local_temp_table_stmt = 30, 
		RULE_create_table_definition = 31, RULE_create_table_columns = 32, RULE_create_table_columns_item = 33, 
		RULE_column_name = 34, RULE_create_table_column_inline_cons = 35, RULE_create_table_column_cons = 36, 
		RULE_create_table_fk_action = 37, RULE_create_table_preoptions = 38, RULE_create_table_preoptions_item = 39, 
		RULE_create_table_preoptions_td_item = 40, RULE_create_table_options = 41, 
		RULE_create_table_options_item = 42, RULE_create_table_options_ora_item = 43, 
		RULE_create_table_options_db2_item = 44, RULE_create_table_options_td_item = 45, 
		RULE_create_table_options_hive_item = 46, RULE_create_table_hive_row_format = 47, 
		RULE_create_table_hive_row_format_fields = 48, RULE_create_table_options_mssql_item = 49, 
		RULE_create_table_options_mysql_item = 50, RULE_dtype = 51, RULE_dtype_len = 52, 
		RULE_dtype_attr = 53, RULE_dtype_default = 54, RULE_create_database_stmt = 55, 
		RULE_create_database_option = 56, RULE_create_function_stmt = 57, RULE_fanc_param_elem = 58, 
		RULE_elems = 59, RULE_scope = 60, RULE_if_in_func = 61, RULE_if_rest = 62, 
		RULE_else_if = 63, RULE_elsee = 64, RULE_for_in_func = 65, RULE_for_params = 66, 
		RULE_for_param = 67, RULE_creat_return = 68, RULE_assignment_in_func = 69, 
		RULE_assignment_0 = 70, RULE_declare = 71, RULE_declare_rest = 72, RULE_assignment_1 = 73, 
		RULE_assignment_2 = 74, RULE_assingnment_rest = 75, RULE_create_function_return = 76, 
		RULE_create_package_stmt = 77, RULE_package_spec = 78, RULE_package_spec_item = 79, 
		RULE_create_package_body_stmt = 80, RULE_package_body = 81, RULE_package_body_item = 82, 
		RULE_create_procedure_stmt = 83, RULE_create_routine_params = 84, RULE_create_routine_param_item = 85, 
		RULE_create_routine_options = 86, RULE_create_routine_option = 87, RULE_if_stmt = 88, 
		RULE_if_plsql_stmt = 89, RULE_if_tsql_stmt = 90, RULE_if_bteq_stmt = 91, 
		RULE_elseif_block = 92, RULE_else_block = 93, RULE_commit_stmt = 94, RULE_create_index_stmt = 95, 
		RULE_create_index_col = 96, RULE_index_storage_clause = 97, RULE_index_mssql_storage_clause = 98, 
		RULE_set_session_option = 99, RULE_set_current_schema_option = 100, RULE_set_mssql_session_option = 101, 
		RULE_set_teradata_session_option = 102, RULE_while_stmt = 103, RULE_for_cursor_stmt = 104, 
		RULE_for_range_stmt = 105, RULE_label = 106, RULE_select_stmt = 107, RULE_cte_select_stmt = 108, 
		RULE_cte_select_stmt_item = 109, RULE_cte_select_cols = 110, RULE_fullselect_stmt = 111, 
		RULE_fullselect_stmt_item = 112, RULE_fullselect_set_clause = 113, RULE_subselect_stmt = 114, 
		RULE_select_list = 115, RULE_select_list_set = 116, RULE_select_list_limit = 117, 
		RULE_select_list_item = 118, RULE_select_list_alias = 119, RULE_select_list_asterisk = 120, 
		RULE_into_clause = 121, RULE_from_clause = 122, RULE_from_table_clause = 123, 
		RULE_from_table_name_clause = 124, RULE_from_subselect_clause = 125, RULE_from_join_clause = 126, 
		RULE_from_join_type_clause = 127, RULE_from_table_values_clause = 128, 
		RULE_from_table_values_row = 129, RULE_from_alias_clause = 130, RULE_table_name = 131, 
		RULE_where_clause = 132, RULE_group_by_clause = 133, RULE_having_clause = 134, 
		RULE_qualify_clause = 135, RULE_order_by_clause = 136, RULE_select_options = 137, 
		RULE_select_options_item = 138, RULE_bool_expr = 139, RULE_bool_expr_atom = 140, 
		RULE_bool_expr_unary = 141, RULE_bool_expr_single_in = 142, RULE_bool_expr_multi_in = 143, 
		RULE_bool_expr_binary = 144, RULE_bool_expr_logical_operator = 145, RULE_bool_expr_binary_operator = 146, 
		RULE_expr = 147, RULE_expr_atom = 148, RULE_expr_interval = 149, RULE_interval_item = 150, 
		RULE_expr_concat = 151, RULE_expr_concat_item = 152, RULE_expr_case = 153, 
		RULE_expr_case_simple = 154, RULE_expr_case_searched = 155, RULE_expr_cursor_attribute = 156, 
		RULE_expr_agg_window_func = 157, RULE_expr_func_all_distinct = 158, RULE_expr_func_over_clause = 159, 
		RULE_expr_func_partition_by_clause = 160, RULE_expr_spec_func = 161, RULE_expr_func = 162, 
		RULE_expr_func_params = 163, RULE_func_param = 164, RULE_date_literal = 165, 
		RULE_timestamp_literal = 166, RULE_ident = 167, RULE_string = 168, RULE_int_number = 169, 
		RULE_dec_number = 170, RULE_bool_literal = 171, RULE_null_const = 172, 
		RULE_non_reserved_words = 173;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
			"proc_block", "semicolon_stmt", "stmt", "exception_block", "exception_block_item", 
			"null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", 
			"assignment_stmt_single_item", "assignment_stmt_multiple_item", "assignment_stmt_select_item", 
			"declare_block", "declare_block_inplace", "declare_stmt_item", "declare_var_item", 
			"declare_condition_item", "declare_cursor_item", "cursor_with_return", 
			"cursor_without_return", "declare_handler_item", "declare_temporary_table_item", 
			"create_table_stmt", "delm", "location", "create_local_temp_table_stmt", 
			"create_table_definition", "create_table_columns", "create_table_columns_item", 
			"column_name", "create_table_column_inline_cons", "create_table_column_cons", 
			"create_table_fk_action", "create_table_preoptions", "create_table_preoptions_item", 
			"create_table_preoptions_td_item", "create_table_options", "create_table_options_item", 
			"create_table_options_ora_item", "create_table_options_db2_item", "create_table_options_td_item", 
			"create_table_options_hive_item", "create_table_hive_row_format", "create_table_hive_row_format_fields", 
			"create_table_options_mssql_item", "create_table_options_mysql_item", 
			"dtype", "dtype_len", "dtype_attr", "dtype_default", "create_database_stmt", 
			"create_database_option", "create_function_stmt", "fanc_param_elem", 
			"elems", "scope", "if_in_func", "if_rest", "else_if", "elsee", "for_in_func", 
			"for_params", "for_param", "creat_return", "assignment_in_func", "assignment_0", 
			"declare", "declare_rest", "assignment_1", "assignment_2", "assingnment_rest", 
			"create_function_return", "create_package_stmt", "package_spec", "package_spec_item", 
			"create_package_body_stmt", "package_body", "package_body_item", "create_procedure_stmt", 
			"create_routine_params", "create_routine_param_item", "create_routine_options", 
			"create_routine_option", "if_stmt", "if_plsql_stmt", "if_tsql_stmt", 
			"if_bteq_stmt", "elseif_block", "else_block", "commit_stmt", "create_index_stmt", 
			"create_index_col", "index_storage_clause", "index_mssql_storage_clause", 
			"set_session_option", "set_current_schema_option", "set_mssql_session_option", 
			"set_teradata_session_option", "while_stmt", "for_cursor_stmt", "for_range_stmt", 
			"label", "select_stmt", "cte_select_stmt", "cte_select_stmt_item", "cte_select_cols", 
			"fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", "subselect_stmt", 
			"select_list", "select_list_set", "select_list_limit", "select_list_item", 
			"select_list_alias", "select_list_asterisk", "into_clause", "from_clause", 
			"from_table_clause", "from_table_name_clause", "from_subselect_clause", 
			"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
			"from_table_values_row", "from_alias_clause", "table_name", "where_clause", 
			"group_by_clause", "having_clause", "qualify_clause", "order_by_clause", 
			"select_options", "select_options_item", "bool_expr", "bool_expr_atom", 
			"bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", 
			"bool_expr_logical_operator", "bool_expr_binary_operator", "expr", "expr_atom", 
			"expr_interval", "interval_item", "expr_concat", "expr_concat_item", 
			"expr_case", "expr_case_simple", "expr_case_searched", "expr_cursor_attribute", 
			"expr_agg_window_func", "expr_func_all_distinct", "expr_func_over_clause", 
			"expr_func_partition_by_clause", "expr_spec_func", "expr_func", "expr_func_params", 
			"func_param", "date_literal", "timestamp_literal", "ident", "string", 
			"int_number", "dec_number", "bool_literal", "null_const", "non_reserved_words"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'#'", "'%'", "'.'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'+'", "':'", "','", 
			"'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", 
			"T_ALTER", "T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", 
			"T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", 
			"T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", 
			"T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", 
			"T_CASCADE", "T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", 
			"T_CHARSET", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", 
			"T_COLLECTION", "T_COLUMN", "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", 
			"T_CONCAT", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", 
			"T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", 
			"T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME", 
			"T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", 
			"T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DELETE", "T_DELIMITED", 
			"T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", 
			"T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", 
			"T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", 
			"T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", 
			"T_EXIT", "T_EXTERNAL", "T_FALLBACK", "T_FALSE", "T_FETCH", "T_FIELDS", 
			"T_FILE", "T_FILES", "T_FLOAT", "T_FOR", "T_FOREIGN", "T_FORMAT", "T_FOUND", 
			"T_FROM", "T_FULL", "T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", "T_GRANT", 
			"T_GROUP", "T_HANDLER", "T_HASH", "T_HAVING", "T_HDFS", "T_HIVE", "T_HOST", 
			"T_IDENTITY", "T_IF", "T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", 
			"T_INDEX", "T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", 
			"T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", 
			"T_INVOKER", "T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", 
			"T_KEYS", "T_LANGUAGE", "T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", 
			"T_LOCAL", "T_LOCATION", "T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", 
			"T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", 
			"T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", "T_MICROSECONDS", "T_MIN", 
			"T_MULTISET", "T_NCHAR", "T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", 
			"T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", 
			"T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", "T_ON", "T_ONLY", "T_OPEN", 
			"T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", 
			"T_PACKAGE", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", "T_PLS_INTEGER", 
			"T_PRECISION", "T_PRESERVE", "T_PRIMARY", "T_PRINT", "T_PROC", "T_PROCEDURE", 
			"T_QUALIFY", "T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", "T_RAISE", 
			"T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESIGNAL", "T_RESTRICT", 
			"T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", "T_REVERSE", 
			"T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", 
			"T_ROW_COUNT", "T_RR", "T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", 
			"T_SECONDS", "T_SECURITY", "T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", 
			"T_SESSION", "T_SESSIONS", "T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", 
			"T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", 
			"T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", 
			"T_STATS", "T_STATISTICS", "T_STEP", "T_STORAGE", "T_STORED", "T_STRING", 
			"T_SUBDIR", "T_SUBSTRING", "T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", 
			"T_TABLESPACE", "T_TEMPORARY", "T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", 
			"T_TIMESTAMP", "T_TINYINT", "T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", 
			"T_TRUE", "T_TRUNCATE", "T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", 
			"T_UR", "T_USE", "T_USING", "T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", 
			"T_VARCHAR2", "T_VARYING", "T_VOLATILE", "T_WHEN", "T_WHERE", "T_WHILE", 
			"T_WITH", "T_WITHOUT", "T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_ACTIVITY_COUNT", 
			"T_CUME_DIST", "T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", 
			"T_DENSE_RANK", "T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
			"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
			"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
			"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", 
			"T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
			"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", 
			"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
			"T_SUB", "L_CHAR", "L_ID", "L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", 
			"L_WS", "L_M_COMMENT", "L_S_COMMENT", "L_FILE", "L_LABEL", "NOT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "parser/HQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HQLParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			block();
			setState(349);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(HQLParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(HQLParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(351);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(352);
						stmt();
						}
						break;
					}
					setState(356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(355);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(360); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HQLParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBegin_end_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(362);
				declare_block();
				}
			}

			setState(365);
			match(T_BEGIN);
			setState(366);
			block();
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(367);
				exception_block();
				}
				break;
			}
			setState(370);
			block_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HQLParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HQLParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSingle_block_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(T_BEGIN);
				setState(373);
				block();
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(374);
					exception_block();
					}
					break;
				}
				setState(377);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				stmt();
				setState(381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(380);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(HQLParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBlock_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(386);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(HQLParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitProc_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(389);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(392); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(394);
					match(T_GO);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(HQLParser.T_SEMICOLON, 0); }
		public TerminalNode T_DIV() { return getToken(HQLParser.T_DIV, 0); }
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSemicolon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSemicolon_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSemicolon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || _la==T_DIV || _la==T_SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public For_cursor_stmtContext for_cursor_stmt() {
			return getRuleContext(For_cursor_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Null_stmtContext null_stmt() {
			return getRuleContext(Null_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				commit_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				create_database_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				create_function_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				create_index_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(406);
				create_local_temp_table_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(407);
				create_package_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(408);
				create_package_body_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(409);
				create_procedure_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(410);
				create_table_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(411);
				for_cursor_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(412);
				for_range_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(413);
				if_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(414);
				select_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(415);
				while_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(416);
				null_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(417);
				expr_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(418);
				semicolon_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(HQLParser.T_EXCEPTION, 0); }
		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}
		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class,i);
		}
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterException_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitException_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitException_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T_EXCEPTION);
			setState(423); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(422);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(425); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() { return getTokens(HQLParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HQLParser.T_WHEN, i);
		}
		public TerminalNode L_ID() { return getToken(HQLParser.L_ID, 0); }
		public TerminalNode T_THEN() { return getToken(HQLParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HQLParser.T_END, 0); }
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterException_block_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitException_block_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitException_block_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T_WHEN);
			setState(428);
			match(L_ID);
			setState(429);
			match(T_THEN);
			setState(430);
			block();
			setState(431);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T_END || _la==T_WHEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_stmtContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HQLParser.T_NULL, 0); }
		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterNull_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitNull_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitNull_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(436);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode T_SET() { return getToken(HQLParser.T_SET, 0); }
		public Set_session_optionContext set_session_option() {
			return getRuleContext(Set_session_optionContext.class,0);
		}
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_stmt);
		try {
			int _alt;
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(T_SET);
				setState(439);
				set_session_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(440);
					match(T_SET);
					}
					break;
				}
				setState(443);
				assignment_stmt_item();
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(444);
						match(T_COMMA);
						setState(445);
						assignment_stmt_item();
						}
						} 
					}
					setState(450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_itemContext extends ParserRuleContext {
		public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return getRuleContext(Assignment_stmt_single_itemContext.class,0);
		}
		public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return getRuleContext(Assignment_stmt_multiple_itemContext.class,0);
		}
		public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return getRuleContext(Assignment_stmt_select_itemContext.class,0);
		}
		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterAssignment_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitAssignment_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitAssignment_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt_item);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				assignment_stmt_select_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HQLParser.T_COLON, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_single_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterAssignment_stmt_single_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitAssignment_stmt_single_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitAssignment_stmt_single_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				ident();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(459);
					match(T_COLON);
					}
				}

				setState(462);
				match(T_EQUAL);
				setState(463);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(T_OPEN_P);
				setState(466);
				ident();
				setState(467);
				match(T_CLOSE_P);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(468);
					match(T_COLON);
					}
				}

				setState(471);
				match(T_EQUAL);
				setState(472);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HQLParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HQLParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HQLParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HQLParser.T_CLOSE_P, i);
		}
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public TerminalNode T_COLON() { return getToken(HQLParser.T_COLON, 0); }
		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_multiple_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterAssignment_stmt_multiple_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitAssignment_stmt_multiple_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitAssignment_stmt_multiple_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T_OPEN_P);
			setState(477);
			ident();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(478);
				match(T_COMMA);
				setState(479);
				ident();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			match(T_CLOSE_P);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(486);
				match(T_COLON);
				}
			}

			setState(489);
			match(T_EQUAL);
			setState(490);
			match(T_OPEN_P);
			setState(491);
			expr(0);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(492);
				match(T_COMMA);
				setState(493);
				expr(0);
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HQLParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HQLParser.T_OPEN_P, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HQLParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HQLParser.T_CLOSE_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(HQLParser.T_COLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterAssignment_stmt_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitAssignment_stmt_select_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitAssignment_stmt_select_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				{
				setState(501);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(502);
				match(T_OPEN_P);
				setState(503);
				ident();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(504);
					match(T_COMMA);
					setState(505);
					ident();
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(511);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(515);
				match(T_COLON);
				}
			}

			setState(518);
			match(T_EQUAL);
			setState(519);
			match(T_OPEN_P);
			setState(520);
			select_stmt();
			setState(521);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HQLParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HQLParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HQLParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDeclare_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T_DECLARE);
			setState(524);
			declare_stmt_item();
			setState(525);
			match(T_SEMICOLON);
			setState(531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(526);
					declare_stmt_item();
					setState(527);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HQLParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HQLParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDeclare_block_inplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			declare_stmt_item();
			setState(535);
			match(T_SEMICOLON);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(536);
					declare_stmt_item();
					setState(537);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDeclare_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declare_stmt_item);
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(546);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(548);
				declare_temporary_table_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(HQLParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDeclare_var_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declare_var_item);
		int _la;
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				ident();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(552);
					match(T_COMMA);
					setState(553);
					ident();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(559);
					match(T_AS);
					}
					break;
				}
				setState(562);
				dtype();
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(563);
					dtype_len();
					}
				}

				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_CASESPECIFIC) | (1L << T_CHARACTER) | (1L << T_CS))) != 0) || _la==T_NOT || _la==T_NULL) {
					{
					{
					setState(566);
					dtype_attr();
					}
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT || ((((_la - 314)) & ~0x3f) == 0 && ((1L << (_la - 314)) & ((1L << (T_WITH - 314)) | (1L << (T_COLON - 314)) | (1L << (T_EQUAL - 314)))) != 0)) {
					{
					setState(572);
					dtype_default();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				ident();
				setState(576);
				match(T_CONSTANT);
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(577);
					match(T_AS);
					}
					break;
				}
				setState(580);
				dtype();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(581);
					dtype_len();
					}
				}

				setState(584);
				dtype_default();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(HQLParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDeclare_condition_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDeclare_condition_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDeclare_condition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			ident();
			setState(589);
			match(T_CONDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(HQLParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(HQLParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(HQLParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDeclare_cursor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDeclare_cursor_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDeclare_cursor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(591);
				match(T_CURSOR);
				setState(592);
				ident();
				}
				break;
			case 2:
				{
				setState(593);
				ident();
				setState(594);
				match(T_CURSOR);
				}
				break;
			}
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(598);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(599);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				break;
			}
			setState(602);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(603);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(604);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HQLParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(HQLParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(HQLParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(HQLParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(HQLParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(HQLParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCursor_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCursor_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCursor_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(T_WITH);
			setState(608);
			match(T_RETURN);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(609);
				match(T_ONLY);
				}
			}

			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(612);
				match(T_TO);
				setState(613);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(HQLParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(HQLParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCursor_without_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCursor_without_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCursor_without_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(T_WITHOUT);
			setState(617);
			match(T_RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(HQLParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(HQLParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(HQLParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(HQLParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HQLParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HQLParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(HQLParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDeclare_handler_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDeclare_handler_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDeclare_handler_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(620);
			match(T_HANDLER);
			setState(621);
			match(T_FOR);
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(622);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(623);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(624);
				match(T_NOT);
				setState(625);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(626);
				ident();
				}
				break;
			}
			setState(629);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(HQLParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(HQLParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(HQLParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDeclare_temporary_table_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDeclare_temporary_table_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(631);
				match(T_GLOBAL);
				}
			}

			setState(634);
			match(T_TEMPORARY);
			setState(635);
			match(T_TABLE);
			setState(636);
			ident();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(637);
				create_table_preoptions();
				}
			}

			setState(640);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HQLParser.T_CREATE, 0); }
		public TerminalNode T_EXTERNAL() { return getToken(HQLParser.T_EXTERNAL, 0); }
		public TerminalNode T_TABLE() { return getToken(HQLParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public DelmContext delm() {
			return getRuleContext(DelmContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(HQLParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HQLParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(T_CREATE);
			setState(643);
			match(T_EXTERNAL);
			setState(644);
			match(T_TABLE);
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(645);
				match(T_IF);
				setState(646);
				match(T_NOT);
				setState(647);
				match(T_EXISTS);
				}
				break;
			}
			setState(650);
			table_name();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(651);
				create_table_preoptions();
				}
			}

			setState(654);
			create_table_definition();
			setState(655);
			delm();
			setState(656);
			location();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelmContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(HQLParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HQLParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HQLParser.T_DELIMITED, 0); }
		public TerminalNode T_FIELDS() { return getToken(HQLParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HQLParser.T_TERMINATED, 0); }
		public TerminalNode T_BY() { return getToken(HQLParser.T_BY, 0); }
		public TerminalNode L_CHAR() { return getToken(HQLParser.L_CHAR, 0); }
		public DelmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDelm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDelm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDelm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelmContext delm() throws RecognitionException {
		DelmContext _localctx = new DelmContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_delm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(T_ROW);
			setState(659);
			match(T_FORMAT);
			setState(660);
			match(T_DELIMITED);
			setState(661);
			match(T_FIELDS);
			setState(662);
			match(T_TERMINATED);
			setState(663);
			match(T_BY);
			setState(664);
			match(L_CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode T_LOCATION() { return getToken(HQLParser.T_LOCATION, 0); }
		public TerminalNode L_FILE() { return getToken(HQLParser.L_FILE, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(T_LOCATION);
			setState(667);
			match(L_FILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HQLParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HQLParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HQLParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HQLParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HQLParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HQLParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(HQLParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_local_temp_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(T_CREATE);
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(670);
				match(T_LOCAL);
				setState(671);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(672);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(675);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(678);
			match(T_TABLE);
			setState(679);
			ident();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(680);
				create_table_preoptions();
				}
			}

			setState(683);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(685);
					match(T_AS);
					}
				}

				setState(688);
				match(T_OPEN_P);
				setState(689);
				select_stmt();
				setState(690);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(692);
					match(T_AS);
					}
				}

				setState(695);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(696);
				match(T_OPEN_P);
				setState(697);
				create_table_columns();
				setState(698);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(702);
				create_table_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			create_table_columns_item();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(706);
				match(T_COMMA);
				setState(707);
				create_table_columns_item();
				}
				}
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HQLParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_columns_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				column_name();
				setState(714);
				dtype();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(715);
					dtype_len();
					}
				}

				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(718);
						dtype_attr();
						}
						} 
					}
					setState(723);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T_DEFAULT - 74)) | (1L << (T_ENABLE - 74)) | (1L << (T_IDENTITY - 74)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (T_NOT - 193)) | (1L << (T_NULL - 193)) | (1L << (T_PRIMARY - 193)) | (1L << (T_REFERENCES - 193)))) != 0) || ((((_la - 299)) & ~0x3f) == 0 && ((1L << (_la - 299)) & ((1L << (T_UNIQUE - 299)) | (1L << (T_WITH - 299)) | (1L << (T_COLON - 299)) | (1L << (T_EQUAL - 299)))) != 0)) {
					{
					{
					setState(724);
					create_table_column_inline_cons();
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(730);
					match(T_CONSTRAINT);
					setState(731);
					ident();
					}
				}

				setState(734);
				create_table_column_cons();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(HQLParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HQLParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HQLParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HQLParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HQLParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(HQLParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HQLParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HQLParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HQLParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(HQLParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_column_inline_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(740);
					match(T_NOT);
					}
				}

				setState(743);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				match(T_PRIMARY);
				setState(745);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(746);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(747);
				match(T_REFERENCES);
				setState(748);
				table_name();
				setState(749);
				match(T_OPEN_P);
				setState(750);
				ident();
				setState(751);
				match(T_CLOSE_P);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(752);
					create_table_fk_action();
					}
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(758);
				match(T_IDENTITY);
				setState(759);
				match(T_OPEN_P);
				setState(760);
				match(L_INT);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(761);
					match(T_COMMA);
					setState(762);
					match(L_INT);
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(768);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(769);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(770);
				match(T_ENABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HQLParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HQLParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HQLParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HQLParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HQLParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HQLParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HQLParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HQLParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HQLParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HQLParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HQLParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HQLParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HQLParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HQLParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_column_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_column_cons);
		int _la;
		try {
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				match(T_PRIMARY);
				setState(774);
				match(T_KEY);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(775);
					match(T_CLUSTERED);
					}
				}

				setState(778);
				match(T_OPEN_P);
				setState(779);
				ident();
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(780);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(783);
					match(T_COMMA);
					setState(784);
					ident();
					setState(786);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(785);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(793);
				match(T_CLOSE_P);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(794);
					match(T_ENABLE);
					}
				}

				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(797);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				match(T_FOREIGN);
				setState(801);
				match(T_KEY);
				setState(802);
				match(T_OPEN_P);
				setState(803);
				ident();
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(804);
					match(T_COMMA);
					setState(805);
					ident();
					}
					}
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(811);
				match(T_CLOSE_P);
				setState(812);
				match(T_REFERENCES);
				setState(813);
				table_name();
				setState(814);
				match(T_OPEN_P);
				setState(815);
				ident();
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(816);
					match(T_COMMA);
					setState(817);
					ident();
					}
					}
					setState(822);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(823);
				match(T_CLOSE_P);
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(824);
					create_table_fk_action();
					}
					}
					setState(829);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HQLParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(HQLParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(HQLParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(HQLParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(HQLParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HQLParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(HQLParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(HQLParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HQLParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(HQLParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_fk_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(T_ON);
			setState(833);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(834);
				match(T_NO);
				setState(835);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(836);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(837);
				match(T_SET);
				setState(838);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(839);
				match(T_SET);
				setState(840);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(841);
				match(T_CASCADE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_preoptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(844);
				create_table_preoptions_item();
				}
				}
				setState(847); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_ROW || _la==T_STORED || _la==T_COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HQLParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_preoptions_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_create_table_preoptions_item);
		try {
			setState(852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				match(T_COMMA);
				setState(850);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				create_table_options_hive_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(HQLParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HQLParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(HQLParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_preoptions_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(854);
				match(T_NO);
				}
			}

			setState(857);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(860); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(859);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(862); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HQLParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(HQLParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(HQLParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(HQLParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HQLParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_options_item);
		int _la;
		try {
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				match(T_ON);
				setState(865);
				match(T_COMMIT);
				setState(866);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(867);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(869);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(870);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(871);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(872);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(873);
				create_table_options_mysql_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(HQLParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(HQLParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HQLParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HQLParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HQLParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HQLParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(HQLParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HQLParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(HQLParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HQLParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HQLParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(HQLParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HQLParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(HQLParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(HQLParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_options_ora_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				match(T_SEGMENT);
				setState(877);
				match(T_CREATION);
				setState(878);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(880);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(881);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(882);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(883);
				match(T_STORAGE);
				setState(884);
				match(T_OPEN_P);
				setState(887); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(887);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case L_ID:
						{
						setState(885);
						ident();
						}
						break;
					case L_INT:
						{
						setState(886);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(889); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)) | (1L << (L_INT - 320)))) != 0) );
				setState(891);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(892);
				match(T_TABLESPACE);
				setState(893);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(HQLParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(HQLParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(HQLParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(HQLParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HQLParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(HQLParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(HQLParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(HQLParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HQLParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(HQLParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(HQLParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HQLParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(HQLParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HQLParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(HQLParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(HQLParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_options_db2_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(896);
					match(T_INDEX);
					}
				}

				setState(899);
				match(T_IN);
				setState(900);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				match(T_WITH);
				setState(902);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(903);
				match(T_DISTRIBUTE);
				setState(904);
				match(T_BY);
				setState(905);
				match(T_HASH);
				setState(906);
				match(T_OPEN_P);
				setState(907);
				ident();
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(908);
					match(T_COMMA);
					setState(909);
					ident();
					}
					}
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(915);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(917);
					match(T_NOT);
					}
				}

				setState(920);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(921);
				match(T_COMPRESS);
				setState(922);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(923);
				match(T_DEFINITION);
				setState(924);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(925);
				match(T_WITH);
				setState(926);
				match(T_RESTRICT);
				setState(927);
				match(T_ON);
				setState(928);
				match(T_DROP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HQLParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(HQLParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HQLParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(HQLParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(HQLParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_options_td_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(931);
					match(T_UNIQUE);
					}
				}

				setState(934);
				match(T_PRIMARY);
				setState(935);
				match(T_INDEX);
				setState(936);
				match(T_OPEN_P);
				setState(937);
				ident();
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(938);
					match(T_COMMA);
					setState(939);
					ident();
					}
					}
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(945);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				match(T_WITH);
				setState(948);
				match(T_DATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(HQLParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_options_hive_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_table_options_hive_item);
		try {
			setState(955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				match(T_STORED);
				setState(953);
				match(T_AS);
				setState(954);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(HQLParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HQLParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HQLParser.T_DELIMITED, 0); }
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_hive_row_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(T_ROW);
			setState(958);
			match(T_FORMAT);
			setState(959);
			match(T_DELIMITED);
			setState(963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(960);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(HQLParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HQLParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(HQLParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(HQLParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(HQLParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HQLParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(HQLParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(HQLParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(HQLParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(HQLParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(HQLParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(HQLParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_hive_row_format_fields);
		try {
			setState(993);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				match(T_FIELDS);
				setState(967);
				match(T_TERMINATED);
				setState(968);
				match(T_BY);
				setState(969);
				expr(0);
				setState(973);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(970);
					match(T_ESCAPED);
					setState(971);
					match(T_BY);
					setState(972);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				match(T_COLLECTION);
				setState(976);
				match(T_ITEMS);
				setState(977);
				match(T_TERMINATED);
				setState(978);
				match(T_BY);
				setState(979);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(980);
				match(T_MAP);
				setState(981);
				match(T_KEYS);
				setState(982);
				match(T_TERMINATED);
				setState(983);
				match(T_BY);
				setState(984);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(985);
				match(T_LINES);
				setState(986);
				match(T_TERMINATED);
				setState(987);
				match(T_BY);
				setState(988);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(989);
				match(T_NULL);
				setState(990);
				match(T_DEFINED);
				setState(991);
				match(T_AS);
				setState(992);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HQLParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HQLParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_options_mssql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_table_options_mssql_item);
		try {
			setState(999);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				match(T_ON);
				setState(996);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				match(T_TEXTIMAGE_ON);
				setState(998);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HQLParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(HQLParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HQLParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HQLParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(HQLParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HQLParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(HQLParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_table_options_mysql_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1028);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				match(T_AUTO_INCREMENT);
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1002);
					match(T_EQUAL);
					}
				}

				setState(1005);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(T_COMMENT);
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1007);
					match(T_EQUAL);
					}
				}

				setState(1010);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1011);
					match(T_DEFAULT);
					}
				}

				setState(1017);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1014);
					match(T_CHARACTER);
					setState(1015);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1016);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1019);
					match(T_EQUAL);
					}
				}

				setState(1022);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1023);
				match(T_ENGINE);
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1024);
					match(T_EQUAL);
					}
				}

				setState(1027);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(HQLParser.T_CHAR, 0); }
		public TerminalNode T_BIGINT() { return getToken(HQLParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HQLParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HQLParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(HQLParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(HQLParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(HQLParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HQLParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(HQLParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HQLParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HQLParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(HQLParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(HQLParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(HQLParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HQLParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HQLParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HQLParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HQLParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(HQLParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HQLParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(HQLParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HQLParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(HQLParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(HQLParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HQLParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(HQLParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HQLParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HQLParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(HQLParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HQLParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HQLParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(HQLParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HQLParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HQLParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(HQLParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HQLParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HQLParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(HQLParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(HQLParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(HQLParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_dtype);
		int _la;
		try {
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				match(T_BIGINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1032);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1033);
				match(T_BINARY_FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1034);
				match(T_BINARY_INTEGER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1035);
				match(T_BIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1036);
				match(T_DATE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1037);
				match(T_DATETIME);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1038);
				match(T_DEC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1039);
				match(T_DECIMAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1040);
				match(T_DOUBLE);
				setState(1042);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1041);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1044);
				match(T_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1045);
				match(T_INT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1046);
				match(T_INT2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1047);
				match(T_INT4);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1048);
				match(T_INT8);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1049);
				match(T_INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1050);
				match(T_NCHAR);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1051);
				match(T_NVARCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1052);
				match(T_NUMBER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1053);
				match(T_NUMERIC);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1054);
				match(T_PLS_INTEGER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1055);
				match(T_REAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1056);
				match(T_RESULT_SET_LOCATOR);
				setState(1057);
				match(T_VARYING);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1058);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1059);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1060);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1061);
				match(T_SMALLINT);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1062);
				match(T_SMALLDATETIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1063);
				match(T_STRING);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1064);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1065);
				match(T_TIMESTAMP);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1066);
				match(T_TINYINT);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1067);
				match(T_VARCHAR);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1068);
				match(T_VARCHAR2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1069);
				match(T_XML);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1070);
				ident();
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1071);
					match(T__2);
					setState(1072);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HQLParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HQLParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(HQLParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(HQLParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(HQLParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(HQLParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDtype_len(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(T_OPEN_P);
			setState(1078);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1079);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1082);
				match(T_COMMA);
				setState(1083);
				match(L_INT);
				}
			}

			setState(1086);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HQLParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HQLParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HQLParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(HQLParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(HQLParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDtype_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_dtype_attr);
		int _la;
		try {
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1088);
					match(T_NOT);
					}
				}

				setState(1091);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				match(T_CHARACTER);
				setState(1093);
				match(T_SET);
				setState(1094);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1095);
					match(T_NOT);
					}
				}

				setState(1098);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HQLParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HQLParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(HQLParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDtype_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_dtype_default);
		int _la;
		try {
			setState(1113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1101);
					match(T_COLON);
					}
				}

				setState(1104);
				match(T_EQUAL);
				setState(1105);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1106);
					match(T_WITH);
					}
				}

				setState(1109);
				match(T_DEFAULT);
				setState(1111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1110);
					expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HQLParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(HQLParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HQLParser.T_SCHEMA, 0); }
		public TerminalNode T_IF() { return getToken(HQLParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HQLParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			match(T_CREATE);
			setState(1116);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1117);
				match(T_IF);
				setState(1118);
				match(T_NOT);
				setState(1119);
				match(T_EXISTS);
				}
				break;
			}
			setState(1122);
			expr(0);
			setState(1126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1123);
					create_database_option();
					}
					} 
				}
				setState(1128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(HQLParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(HQLParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_database_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_create_database_option);
		try {
			setState(1133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				match(T_COMMENT);
				setState(1130);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				match(T_LOCATION);
				setState(1132);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_stmtContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(HQLParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(HQLParser.T_CLOSE_B, 0); }
		public Fanc_param_elemContext fanc_param_elem() {
			return getRuleContext(Fanc_param_elemContext.class,0);
		}
		public List<ElemsContext> elems() {
			return getRuleContexts(ElemsContext.class);
		}
		public ElemsContext elems(int i) {
			return getRuleContext(ElemsContext.class,i);
		}
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_create_function_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			dtype();
			setState(1136);
			ident();
			setState(1137);
			match(T_OPEN_P);
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PLS_INTEGER - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SIMPLE_INTEGER - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				setState(1138);
				fanc_param_elem();
				}
			}

			setState(1141);
			match(T_CLOSE_P);
			setState(1142);
			match(T_OPEN_B);
			setState(1146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1143);
					elems();
					}
					} 
				}
				setState(1148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(1149);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fanc_param_elemContext extends ParserRuleContext {
		public List<DtypeContext> dtype() {
			return getRuleContexts(DtypeContext.class);
		}
		public DtypeContext dtype(int i) {
			return getRuleContext(DtypeContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Fanc_param_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fanc_param_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFanc_param_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFanc_param_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFanc_param_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fanc_param_elemContext fanc_param_elem() throws RecognitionException {
		Fanc_param_elemContext _localctx = new Fanc_param_elemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fanc_param_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1151);
			dtype();
			setState(1152);
			ident();
			setState(1162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1153);
					match(T_COMMA);
					setState(1154);
					dtype();
					setState(1155);
					ident();
					}
					}
					setState(1161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElemsContext extends ParserRuleContext {
		public Creat_returnContext creat_return() {
			return getRuleContext(Creat_returnContext.class,0);
		}
		public If_in_funcContext if_in_func() {
			return getRuleContext(If_in_funcContext.class,0);
		}
		public For_in_funcContext for_in_func() {
			return getRuleContext(For_in_funcContext.class,0);
		}
		public Assignment_in_funcContext assignment_in_func() {
			return getRuleContext(Assignment_in_funcContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public ElemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterElems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitElems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitElems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemsContext elems() throws RecognitionException {
		ElemsContext _localctx = new ElemsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elems);
		try {
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				creat_return();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				if_in_func();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1166);
				for_in_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1167);
				assignment_in_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1168);
				stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1169);
				scope();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode T_OPEN_B() { return getToken(HQLParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(HQLParser.T_CLOSE_B, 0); }
		public List<ElemsContext> elems() {
			return getRuleContexts(ElemsContext.class);
		}
		public ElemsContext elems(int i) {
			return getRuleContext(ElemsContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_scope);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			match(T_OPEN_B);
			setState(1176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1173);
					elems();
					}
					} 
				}
				setState(1178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			setState(1179);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_in_funcContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HQLParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(HQLParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(HQLParser.T_CLOSE_B, 0); }
		public List<ElemsContext> elems() {
			return getRuleContexts(ElemsContext.class);
		}
		public ElemsContext elems(int i) {
			return getRuleContext(ElemsContext.class,i);
		}
		public If_restContext if_rest() {
			return getRuleContext(If_restContext.class,0);
		}
		public If_in_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_in_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterIf_in_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitIf_in_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitIf_in_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_in_funcContext if_in_func() throws RecognitionException {
		If_in_funcContext _localctx = new If_in_funcContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_if_in_func);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(T_IF);
			setState(1182);
			match(T_OPEN_P);
			setState(1183);
			bool_expr(0);
			setState(1184);
			match(T_CLOSE_P);
			setState(1185);
			match(T_OPEN_B);
			setState(1189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1186);
					elems();
					}
					} 
				}
				setState(1191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			setState(1192);
			match(T_CLOSE_B);
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1193);
				if_rest();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_restContext extends ParserRuleContext {
		public ElseeContext elsee() {
			return getRuleContext(ElseeContext.class,0);
		}
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public If_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterIf_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitIf_rest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitIf_rest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_restContext if_rest() throws RecognitionException {
		If_restContext _localctx = new If_restContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_if_rest);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1196);
						else_if();
						}
						} 
					}
					setState(1201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				}
				break;
			}
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1204);
				elsee();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HQLParser.T_ELSE, 0); }
		public TerminalNode T_IF() { return getToken(HQLParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(HQLParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(HQLParser.T_CLOSE_B, 0); }
		public List<ElemsContext> elems() {
			return getRuleContexts(ElemsContext.class);
		}
		public ElemsContext elems(int i) {
			return getRuleContext(ElemsContext.class,i);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitElse_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitElse_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_else_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(T_ELSE);
			setState(1208);
			match(T_IF);
			setState(1209);
			match(T_OPEN_P);
			setState(1210);
			bool_expr(0);
			setState(1211);
			match(T_CLOSE_P);
			setState(1212);
			match(T_OPEN_B);
			setState(1216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1213);
					elems();
					}
					} 
				}
				setState(1218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			setState(1219);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseeContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HQLParser.T_ELSE, 0); }
		public TerminalNode T_OPEN_B() { return getToken(HQLParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(HQLParser.T_CLOSE_B, 0); }
		public List<ElemsContext> elems() {
			return getRuleContexts(ElemsContext.class);
		}
		public ElemsContext elems(int i) {
			return getRuleContext(ElemsContext.class,i);
		}
		public ElseeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterElsee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitElsee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitElsee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseeContext elsee() throws RecognitionException {
		ElseeContext _localctx = new ElseeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_elsee);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			match(T_ELSE);
			setState(1222);
			match(T_OPEN_B);
			setState(1226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1223);
					elems();
					}
					} 
				}
				setState(1228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			setState(1229);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_in_funcContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HQLParser.T_FOR, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public List<For_paramsContext> for_params() {
			return getRuleContexts(For_paramsContext.class);
		}
		public For_paramsContext for_params(int i) {
			return getRuleContext(For_paramsContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HQLParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HQLParser.T_SEMICOLON, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(HQLParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(HQLParser.T_CLOSE_B, 0); }
		public List<ElemsContext> elems() {
			return getRuleContexts(ElemsContext.class);
		}
		public ElemsContext elems(int i) {
			return getRuleContext(ElemsContext.class,i);
		}
		public For_in_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFor_in_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFor_in_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFor_in_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_funcContext for_in_func() throws RecognitionException {
		For_in_funcContext _localctx = new For_in_funcContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_for_in_func);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(T_FOR);
			setState(1232);
			match(T_OPEN_P);
			setState(1233);
			for_params();
			setState(1234);
			match(T_SEMICOLON);
			setState(1235);
			for_params();
			setState(1236);
			match(T_SEMICOLON);
			setState(1237);
			for_params();
			setState(1238);
			match(T_CLOSE_P);
			setState(1239);
			match(T_OPEN_B);
			setState(1243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1240);
					elems();
					}
					} 
				}
				setState(1245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(1246);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_paramsContext extends ParserRuleContext {
		public For_paramContext for_param() {
			return getRuleContext(For_paramContext.class,0);
		}
		public For_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFor_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFor_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFor_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_paramsContext for_params() throws RecognitionException {
		For_paramsContext _localctx = new For_paramsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_for_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			for_param();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_paramContext extends ParserRuleContext {
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<Assignment_0Context> assignment_0() {
			return getRuleContexts(Assignment_0Context.class);
		}
		public Assignment_0Context assignment_0(int i) {
			return getRuleContext(Assignment_0Context.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public For_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFor_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFor_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFor_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_paramContext for_param() throws RecognitionException {
		For_paramContext _localctx = new For_paramContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_for_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NULL - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PLS_INTEGER - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SIMPLE_INTEGER - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_MAX_PART_STRING - 320)) | (1L << (T_MIN_PART_STRING - 320)) | (1L << (T_MAX_PART_INT - 320)) | (1L << (T_MIN_PART_INT - 320)) | (1L << (T_MAX_PART_DATE - 320)) | (1L << (T_MIN_PART_DATE - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (T_ADD - 320)) | (1L << (T_OPEN_P - 320)) | (1L << (T_SUB - 320)) | (1L << (L_ID - 320)) | (1L << (L_S_STRING - 320)) | (1L << (L_D_STRING - 320)) | (1L << (L_INT - 320)) | (1L << (L_DEC - 320)) | (1L << (NOT - 320)))) != 0)) {
				{
				setState(1252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1250);
					bool_expr(0);
					}
					break;
				case 2:
					{
					setState(1251);
					assignment_0();
					}
					break;
				}
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1254);
					match(T_COMMA);
					setState(1257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(1255);
						bool_expr(0);
						}
						break;
					case 2:
						{
						setState(1256);
						assignment_0();
						}
						break;
					}
					}
					}
					setState(1263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creat_returnContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(HQLParser.T_RETURN, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HQLParser.T_SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Creat_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creat_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreat_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreat_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreat_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Creat_returnContext creat_return() throws RecognitionException {
		Creat_returnContext _localctx = new Creat_returnContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_creat_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(T_RETURN);
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1267);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1268);
				select_stmt();
				}
				break;
			}
			setState(1271);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_in_funcContext extends ParserRuleContext {
		public Assignment_0Context assignment_0() {
			return getRuleContext(Assignment_0Context.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HQLParser.T_SEMICOLON, 0); }
		public Assignment_in_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_in_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterAssignment_in_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitAssignment_in_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitAssignment_in_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_in_funcContext assignment_in_func() throws RecognitionException {
		Assignment_in_funcContext _localctx = new Assignment_in_funcContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assignment_in_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			assignment_0();
			setState(1274);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_0Context extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public Assignment_1Context assignment_1() {
			return getRuleContext(Assignment_1Context.class,0);
		}
		public Assignment_2Context assignment_2() {
			return getRuleContext(Assignment_2Context.class,0);
		}
		public Assignment_0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterAssignment_0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitAssignment_0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitAssignment_0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_0Context assignment_0() throws RecognitionException {
		Assignment_0Context _localctx = new Assignment_0Context(_ctx, getState());
		enterRule(_localctx, 140, RULE_assignment_0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1276);
				declare();
				}
				break;
			case 2:
				{
				setState(1277);
				assignment_1();
				}
				break;
			case 3:
				{
				setState(1278);
				assignment_2();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<Declare_restContext> declare_rest() {
			return getRuleContexts(Declare_restContext.class);
		}
		public Declare_restContext declare_rest(int i) {
			return getRuleContext(Declare_restContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_declare);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			dtype();
			setState(1282);
			ident();
			setState(1284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(1283);
				declare_rest();
				}
			}

			setState(1293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1286);
					match(T_COMMA);
					setState(1287);
					ident();
					setState(1289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_EQUAL) {
						{
						setState(1288);
						declare_rest();
						}
					}

					}
					} 
				}
				setState(1295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_restContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Declare_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDeclare_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDeclare_rest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDeclare_rest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_restContext declare_rest() throws RecognitionException {
		Declare_restContext _localctx = new Declare_restContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_declare_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(T_EQUAL);
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1297);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1298);
				select_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_1Context extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TerminalNode> T_SUB() { return getTokens(HQLParser.T_SUB); }
		public TerminalNode T_SUB(int i) {
			return getToken(HQLParser.T_SUB, i);
		}
		public List<TerminalNode> T_ADD() { return getTokens(HQLParser.T_ADD); }
		public TerminalNode T_ADD(int i) {
			return getToken(HQLParser.T_ADD, i);
		}
		public Assignment_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterAssignment_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitAssignment_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitAssignment_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_1Context assignment_1() throws RecognitionException {
		Assignment_1Context _localctx = new Assignment_1Context(_ctx, getState());
		enterRule(_localctx, 146, RULE_assignment_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SUB:
				{
				setState(1301);
				match(T_SUB);
				setState(1302);
				match(T_SUB);
				}
				break;
			case T_ADD:
				{
				setState(1303);
				match(T_ADD);
				setState(1304);
				match(T_ADD);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case L_ID:
				break;
			default:
				break;
			}
			setState(1307);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_2Context extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Assingnment_restContext assingnment_rest() {
			return getRuleContext(Assingnment_restContext.class,0);
		}
		public List<TerminalNode> T_SUB() { return getTokens(HQLParser.T_SUB); }
		public TerminalNode T_SUB(int i) {
			return getToken(HQLParser.T_SUB, i);
		}
		public List<TerminalNode> T_ADD() { return getTokens(HQLParser.T_ADD); }
		public TerminalNode T_ADD(int i) {
			return getToken(HQLParser.T_ADD, i);
		}
		public Assignment_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterAssignment_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitAssignment_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitAssignment_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_2Context assignment_2() throws RecognitionException {
		Assignment_2Context _localctx = new Assignment_2Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_assignment_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			ident();
			setState(1315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1310);
				assingnment_rest();
				}
				break;
			case 2:
				{
				setState(1311);
				match(T_SUB);
				setState(1312);
				match(T_SUB);
				}
				break;
			case 3:
				{
				setState(1313);
				match(T_ADD);
				setState(1314);
				match(T_ADD);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assingnment_restContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public TerminalNode T_ADD() { return getToken(HQLParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(HQLParser.T_SUB, 0); }
		public TerminalNode T_DIV() { return getToken(HQLParser.T_DIV, 0); }
		public TerminalNode T_MUL() { return getToken(HQLParser.T_MUL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Assingnment_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assingnment_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterAssingnment_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitAssingnment_rest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitAssingnment_rest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assingnment_restContext assingnment_rest() throws RecognitionException {
		Assingnment_restContext _localctx = new Assingnment_restContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assingnment_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				{
				setState(1317);
				match(T_EQUAL);
				}
				break;
			case T_ADD:
				{
				setState(1318);
				match(T_ADD);
				setState(1319);
				match(T_EQUAL);
				}
				break;
			case T_SUB:
				{
				setState(1320);
				match(T_SUB);
				setState(1321);
				match(T_EQUAL);
				}
				break;
			case T_DIV:
				{
				setState(1322);
				match(T_DIV);
				setState(1323);
				match(T_EQUAL);
				}
				break;
			case T_MUL:
				{
				setState(1324);
				match(T_MUL);
				setState(1325);
				match(T_EQUAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1328);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1329);
				select_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(HQLParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HQLParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_function_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1333);
			dtype();
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1334);
				dtype_len();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HQLParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HQLParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HQLParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HQLParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HQLParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HQLParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HQLParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HQLParser.T_OR, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_package_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1337);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1338);
				match(T_CREATE);
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1339);
					match(T_OR);
					setState(1340);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1343);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1346);
			match(T_PACKAGE);
			setState(1347);
			ident();
			setState(1348);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1349);
			package_spec();
			setState(1350);
			match(T_END);
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1351);
				ident();
				setState(1352);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HQLParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HQLParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitPackage_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			package_spec_item();
			setState(1357);
			match(T_SEMICOLON);
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1358);
				package_spec_item();
				setState(1359);
				match(T_SEMICOLON);
				}
				}
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(HQLParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HQLParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HQLParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitPackage_spec_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_package_spec_item);
		int _la;
		try {
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1366);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1367);
				match(T_FUNCTION);
				setState(1368);
				ident();
				setState(1370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1369);
					create_routine_params();
					}
					break;
				}
				setState(1372);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1374);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1375);
				ident();
				setState(1377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1376);
					create_routine_params();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HQLParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(HQLParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HQLParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HQLParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HQLParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HQLParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HQLParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HQLParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HQLParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_package_body_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1381);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1382);
				match(T_CREATE);
				setState(1385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1383);
					match(T_OR);
					setState(1384);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1387);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1390);
			match(T_PACKAGE);
			setState(1391);
			match(T_BODY);
			setState(1392);
			ident();
			setState(1393);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1394);
			package_body();
			setState(1395);
			match(T_END);
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1396);
				ident();
				setState(1397);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HQLParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HQLParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			package_body_item();
			setState(1402);
			match(T_SEMICOLON);
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PLS_INTEGER - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SIMPLE_INTEGER - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TINYINT - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)) | (1L << (L_ID - 320)))) != 0)) {
				{
				{
				setState(1403);
				package_body_item();
				setState(1404);
				match(T_SEMICOLON);
				}
				}
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitPackage_body_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_package_body_item);
		try {
			setState(1414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1413);
				create_procedure_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HQLParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HQLParser.T_PROC, 0); }
		public TerminalNode T_ALTER() { return getToken(HQLParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HQLParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HQLParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HQLParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HQLParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HQLParser.T_OR, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_procedure_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1416);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1417);
				match(T_CREATE);
				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1418);
					match(T_OR);
					setState(1419);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1422);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1425);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1426);
			ident();
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1427);
				create_routine_params();
				}
				break;
			}
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1430);
				create_routine_options();
				}
				break;
			}
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1433);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1436);
				declare_block_inplace();
				}
				break;
			}
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1439);
				label();
				}
				break;
			}
			setState(1442);
			proc_block();
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1443);
				ident();
				setState(1444);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_routine_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1448);
				match(T_OPEN_P);
				setState(1449);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1450);
				match(T_OPEN_P);
				setState(1451);
				create_routine_param_item();
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1452);
					match(T_COMMA);
					setState(1453);
					create_routine_param_item();
					}
					}
					setState(1458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1459);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1461);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1462);
				create_routine_param_item();
				setState(1467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1463);
						match(T_COMMA);
						setState(1464);
						create_routine_param_item();
						}
						} 
					}
					setState(1469);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(HQLParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(HQLParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(HQLParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_routine_param_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1472);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1473);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1474);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1475);
					match(T_IN);
					setState(1476);
					match(T_OUT);
					}
					break;
				}
				setState(1479);
				ident();
				setState(1480);
				dtype();
				setState(1482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1481);
					dtype_len();
					}
					break;
				}
				setState(1487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1484);
						dtype_attr();
						}
						} 
					}
					setState(1489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				setState(1491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1490);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1493);
				ident();
				setState(1499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1494);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1495);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1496);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1497);
					match(T_IN);
					setState(1498);
					match(T_OUT);
					}
					break;
				}
				setState(1501);
				dtype();
				setState(1503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1502);
					dtype_len();
					}
					break;
				}
				setState(1508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1505);
						dtype_attr();
						}
						} 
					}
					setState(1510);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				setState(1512);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1511);
					dtype_default();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_routine_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_routine_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_routine_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1517); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1516);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1519); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(HQLParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(HQLParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(HQLParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(HQLParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(HQLParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(HQLParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(HQLParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(HQLParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(HQLParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(HQLParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HQLParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_routine_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_routine_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_routine_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_create_routine_option);
		int _la;
		try {
			setState(1532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				match(T_LANGUAGE);
				setState(1522);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523);
				match(T_SQL);
				setState(1524);
				match(T_SECURITY);
				setState(1525);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1526);
					match(T_DYNAMIC);
					}
				}

				setState(1529);
				match(T_RESULT);
				setState(1530);
				match(T_SETS);
				setState(1531);
				match(L_INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_if_stmt);
		try {
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1534);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1535);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1536);
				if_bteq_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(HQLParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(HQLParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HQLParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HQLParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterIf_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitIf_plsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitIf_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(T_IF);
			setState(1540);
			bool_expr(0);
			setState(1541);
			match(T_THEN);
			setState(1542);
			block();
			setState(1546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1543);
				elseif_block();
				}
				}
				setState(1548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1549);
				else_block();
				}
			}

			setState(1552);
			match(T_END);
			setState(1553);
			match(T_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HQLParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HQLParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterIf_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitIf_tsql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitIf_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			match(T_IF);
			setState(1556);
			bool_expr(0);
			setState(1557);
			single_block_stmt();
			setState(1560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1558);
				match(T_ELSE);
				setState(1559);
				single_block_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HQLParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HQLParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterIf_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitIf_bteq_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitIf_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(T__3);
			setState(1563);
			match(T_IF);
			setState(1564);
			bool_expr(0);
			setState(1565);
			match(T_THEN);
			setState(1566);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HQLParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(HQLParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(HQLParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitElseif_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1569);
			bool_expr(0);
			setState(1570);
			match(T_THEN);
			setState(1571);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HQLParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(T_ELSE);
			setState(1574);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode T_COMMIT() { return getToken(HQLParser.T_COMMIT, 0); }
		public TerminalNode T_WORK() { return getToken(HQLParser.T_WORK, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_commit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			match(T_COMMIT);
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1577);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HQLParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(HQLParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HQLParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HQLParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(T_CREATE);
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1581);
				match(T_UNIQUE);
				}
			}

			setState(1584);
			match(T_INDEX);
			setState(1585);
			ident();
			setState(1586);
			match(T_ON);
			setState(1587);
			table_name();
			setState(1588);
			match(T_OPEN_P);
			setState(1589);
			create_index_col();
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1590);
				match(T_COMMA);
				setState(1591);
				create_index_col();
				}
				}
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1597);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(HQLParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(HQLParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCreate_index_col(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			ident();
			setState(1601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1600);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterIndex_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitIndex_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitIndex_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			index_mssql_storage_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HQLParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HQLParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HQLParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterIndex_mssql_storage_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitIndex_mssql_storage_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_index_mssql_storage_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			match(T_WITH);
			setState(1606);
			match(T_OPEN_P);
			setState(1607);
			ident();
			setState(1608);
			match(T_EQUAL);
			setState(1609);
			ident();
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1610);
				match(T_COMMA);
				setState(1611);
				ident();
				setState(1612);
				match(T_EQUAL);
				setState(1613);
				ident();
				}
				}
				setState(1619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1620);
			match(T_CLOSE_P);
			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ON || _la==T_TEXTIMAGE_ON) {
				{
				{
				setState(1621);
				create_table_options_mssql_item();
				}
				}
				setState(1626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_session_optionContext extends ParserRuleContext {
		public Set_current_schema_optionContext set_current_schema_option() {
			return getRuleContext(Set_current_schema_optionContext.class,0);
		}
		public Set_mssql_session_optionContext set_mssql_session_option() {
			return getRuleContext(Set_mssql_session_optionContext.class,0);
		}
		public Set_teradata_session_optionContext set_teradata_session_option() {
			return getRuleContext(Set_teradata_session_optionContext.class,0);
		}
		public Set_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSet_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSet_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSet_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_session_optionContext set_session_option() throws RecognitionException {
		Set_session_optionContext _localctx = new Set_session_optionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_set_session_option);
		try {
			setState(1630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				set_current_schema_option();
				}
				break;
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_NOCOUNT:
			case T_QUOTED_IDENTIFIER:
			case T_XACT_ABORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1629);
				set_teradata_session_option();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_current_schema_optionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HQLParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HQLParser.T_SCHEMA, 0); }
		public TerminalNode T_CURRENT() { return getToken(HQLParser.T_CURRENT, 0); }
		public Set_current_schema_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_current_schema_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSet_current_schema_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSet_current_schema_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSet_current_schema_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_current_schema_optionContext set_current_schema_option() throws RecognitionException {
		Set_current_schema_optionContext _localctx = new Set_current_schema_optionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(1633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(1632);
					match(T_CURRENT);
					}
				}

				setState(1635);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(1636);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(1639);
				match(T_EQUAL);
				}
			}

			setState(1642);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_mssql_session_optionContext extends ParserRuleContext {
		public TerminalNode T_ANSI_NULLS() { return getToken(HQLParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HQLParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HQLParser.T_NOCOUNT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HQLParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HQLParser.T_XACT_ABORT, 0); }
		public TerminalNode T_ON() { return getToken(HQLParser.T_ON, 0); }
		public TerminalNode T_OFF() { return getToken(HQLParser.T_OFF, 0); }
		public Set_mssql_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mssql_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSet_mssql_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSet_mssql_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSet_mssql_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_mssql_session_optionContext set_mssql_session_option() throws RecognitionException {
		Set_mssql_session_optionContext _localctx = new Set_mssql_session_optionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1645);
			_la = _input.LA(1);
			if ( !(_la==T_OFF || _la==T_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_teradata_session_optionContext extends ParserRuleContext {
		public TerminalNode T_QUERY_BAND() { return getToken(HQLParser.T_QUERY_BAND, 0); }
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public TerminalNode T_FOR() { return getToken(HQLParser.T_FOR, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HQLParser.T_TRANSACTION, 0); }
		public TerminalNode T_SESSION() { return getToken(HQLParser.T_SESSION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_NONE() { return getToken(HQLParser.T_NONE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HQLParser.T_UPDATE, 0); }
		public Set_teradata_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_teradata_session_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSet_teradata_session_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSet_teradata_session_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSet_teradata_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_teradata_session_optionContext set_teradata_session_option() throws RecognitionException {
		Set_teradata_session_optionContext _localctx = new Set_teradata_session_optionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			match(T_QUERY_BAND);
			setState(1648);
			match(T_EQUAL);
			setState(1651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1649);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1650);
				match(T_NONE);
				}
				break;
			}
			setState(1654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(1653);
				match(T_UPDATE);
				}
			}

			setState(1656);
			match(T_FOR);
			setState(1657);
			_la = _input.LA(1);
			if ( !(_la==T_SESSION || _la==T_TRANSACTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_WHILE() { return getTokens(HQLParser.T_WHILE); }
		public TerminalNode T_WHILE(int i) {
			return getToken(HQLParser.T_WHILE, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HQLParser.T_END, 0); }
		public TerminalNode T_DO() { return getToken(HQLParser.T_DO, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HQLParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HQLParser.T_LOOP, i);
		}
		public TerminalNode T_THEN() { return getToken(HQLParser.T_THEN, 0); }
		public TerminalNode T_BEGIN() { return getToken(HQLParser.T_BEGIN, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			match(T_WHILE);
			setState(1660);
			bool_expr(0);
			setState(1661);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1662);
			block();
			setState(1663);
			match(T_END);
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1664);
				_la = _input.LA(1);
				if ( !(_la==T_LOOP || _la==T_WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HQLParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HQLParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HQLParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_LOOP() { return getTokens(HQLParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HQLParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HQLParser.T_END, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public For_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cursor_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFor_cursor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFor_cursor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFor_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cursor_stmtContext for_cursor_stmt() throws RecognitionException {
		For_cursor_stmtContext _localctx = new For_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_for_cursor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			match(T_FOR);
			setState(1668);
			match(L_ID);
			setState(1669);
			match(T_IN);
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1670);
				match(T_OPEN_P);
				}
				break;
			}
			setState(1673);
			select_stmt();
			setState(1675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(1674);
				match(T_CLOSE_P);
				}
			}

			setState(1677);
			match(T_LOOP);
			setState(1678);
			block();
			setState(1679);
			match(T_END);
			setState(1680);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HQLParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HQLParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HQLParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(HQLParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HQLParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HQLParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HQLParser.T_END, 0); }
		public TerminalNode T_REVERSE() { return getToken(HQLParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(HQLParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(HQLParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFor_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFor_range_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFor_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(T_FOR);
			setState(1683);
			match(L_ID);
			setState(1684);
			match(T_IN);
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1685);
				match(T_REVERSE);
				}
				break;
			}
			setState(1688);
			expr(0);
			setState(1689);
			match(T_DOT2);
			setState(1690);
			expr(0);
			setState(1693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1691);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1692);
				expr(0);
				}
			}

			setState(1695);
			match(T_LOOP);
			setState(1696);
			block();
			setState(1697);
			match(T_END);
			setState(1698);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(HQLParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(HQLParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(HQLParser.T_LESS, i);
		}
		public TerminalNode L_ID() { return getToken(HQLParser.L_ID, 0); }
		public List<TerminalNode> T_GREATER() { return getTokens(HQLParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(HQLParser.T_GREATER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_label);
		try {
			setState(1706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1700);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1701);
				match(T_LESS);
				setState(1702);
				match(T_LESS);
				setState(1703);
				match(L_ID);
				setState(1704);
				match(T_GREATER);
				setState(1705);
				match(T_GREATER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1708);
				cte_select_stmt();
				}
			}

			setState(1711);
			fullselect_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HQLParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCte_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			match(T_WITH);
			setState(1714);
			cte_select_stmt_item();
			setState(1719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1715);
				match(T_COMMA);
				setState(1716);
				cte_select_stmt_item();
				}
				}
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCte_select_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			ident();
			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1723);
				cte_select_cols();
				}
			}

			setState(1726);
			match(T_AS);
			setState(1727);
			match(T_OPEN_P);
			setState(1728);
			fullselect_stmt();
			setState(1729);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitCte_select_cols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(T_OPEN_P);
			setState(1732);
			ident();
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1733);
				match(T_COMMA);
				setState(1734);
				ident();
				}
				}
				setState(1739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1740);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFullselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			fullselect_stmt_item();
			setState(1748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1743);
					fullselect_set_clause();
					setState(1744);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFullselect_stmt_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_fullselect_stmt_item);
		try {
			setState(1756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1751);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1752);
				match(T_OPEN_P);
				setState(1753);
				fullselect_stmt();
				setState(1754);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(HQLParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(HQLParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HQLParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HQLParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFullselect_set_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1758);
				match(T_UNION);
				setState(1760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1759);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1762);
				match(T_EXCEPT);
				setState(1764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1763);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1766);
				match(T_INTERSECT);
				setState(1768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1767);
					match(T_ALL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subselect_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(HQLParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(HQLParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSubselect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1773);
			select_list();
			setState(1775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1774);
				into_clause();
				}
				break;
			}
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1777);
				from_clause();
				}
				break;
			}
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1780);
				where_clause();
				}
				break;
			}
			setState(1784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1783);
				group_by_clause();
				}
				break;
			}
			setState(1788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1786);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1787);
				qualify_clause();
				}
				break;
			}
			setState(1791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1790);
				order_by_clause();
				}
				break;
			}
			setState(1794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1793);
				select_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1796);
				select_list_set();
				}
				break;
			}
			setState(1800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1799);
				select_list_limit();
				}
				break;
			}
			setState(1802);
			select_list_item();
			setState(1807);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1803);
					match(T_COMMA);
					setState(1804);
					select_list_item();
					}
					} 
				}
				setState(1809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HQLParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HQLParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSelect_list_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(HQLParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSelect_list_limit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			match(T_TOP);
			setState(1813);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_itemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSelect_list_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1815);
					ident();
					setState(1816);
					match(T_EQUAL);
					}
					break;
				}
				setState(1820);
				expr(0);
				setState(1822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1821);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1824);
				select_list_asterisk();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(HQLParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(HQLParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSelect_list_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_select_list_alias);
		try {
			setState(1836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1827);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1828);
					match(T_AS);
					}
					break;
				}
				setState(1831);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1832);
				match(T_OPEN_P);
				setState(1833);
				match(T_TITLE);
				setState(1834);
				match(L_S_STRING);
				setState(1835);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode T_MUL() { return getToken(HQLParser.T_MUL, 0); }
		public TerminalNode L_ID() { return getToken(HQLParser.L_ID, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSelect_list_asterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1838);
				match(L_ID);
				setState(1839);
				match(T__3);
				}
			}

			setState(1842);
			match(T_MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(HQLParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitInto_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			match(T_INTO);
			setState(1845);
			ident();
			setState(1850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1846);
					match(T_COMMA);
					setState(1847);
					ident();
					}
					} 
				}
				setState(1852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(HQLParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			match(T_FROM);
			setState(1854);
			from_table_clause();
			setState(1858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1855);
					from_join_clause();
					}
					} 
				}
				setState(1860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFrom_table_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_from_table_clause);
		try {
			setState(1864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1861);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1862);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1863);
				from_table_values_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFrom_table_name_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			table_name();
			setState(1868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1867);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFrom_subselect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			match(T_OPEN_P);
			setState(1871);
			select_stmt();
			setState(1872);
			match(T_CLOSE_P);
			setState(1874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1873);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HQLParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HQLParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFrom_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_from_join_clause);
		try {
			setState(1883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1876);
				match(T_COMMA);
				setState(1877);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1878);
				from_join_type_clause();
				setState(1879);
				from_table_clause();
				setState(1880);
				match(T_ON);
				setState(1881);
				bool_expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(HQLParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(HQLParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(HQLParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(HQLParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(HQLParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(HQLParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFrom_join_type_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_from_join_type_clause);
		int _la;
		try {
			setState(1894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1885);
					match(T_INNER);
					}
				}

				setState(1888);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1890);
					match(T_OUTER);
					}
				}

				setState(1893);
				match(T_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(HQLParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(HQLParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFrom_table_values_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			match(T_TABLE);
			setState(1897);
			match(T_OPEN_P);
			setState(1898);
			match(T_VALUES);
			setState(1899);
			from_table_values_row();
			setState(1904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1900);
				match(T_COMMA);
				setState(1901);
				from_table_values_row();
				}
				}
				setState(1906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1907);
			match(T_CLOSE_P);
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1908);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFrom_table_values_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_from_table_values_row);
		int _la;
		try {
			setState(1923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
				match(T_OPEN_P);
				setState(1913);
				expr(0);
				setState(1918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1914);
					match(T_COMMA);
					setState(1915);
					expr(0);
					}
					}
					setState(1920);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1921);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HQLParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HQLParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFrom_alias_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(1927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1926);
				match(T_AS);
				}
				break;
			}
			setState(1929);
			ident();
			setState(1940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1930);
				match(T_OPEN_P);
				setState(1931);
				match(L_ID);
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1932);
					match(T_COMMA);
					setState(1933);
					match(L_ID);
					}
					}
					setState(1938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1939);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(HQLParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			match(T_WHERE);
			setState(1945);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(HQLParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(HQLParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitGroup_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			match(T_GROUP);
			setState(1948);
			match(T_BY);
			setState(1949);
			expr(0);
			setState(1954);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1950);
					match(T_COMMA);
					setState(1951);
					expr(0);
					}
					} 
				}
				setState(1956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(HQLParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			match(T_HAVING);
			setState(1958);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(HQLParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitQualify_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
			match(T_QUALIFY);
			setState(1961);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(HQLParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(HQLParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HQLParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HQLParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HQLParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HQLParser.T_DESC, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitOrder_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			match(T_ORDER);
			setState(1964);
			match(T_BY);
			setState(1965);
			expr(0);
			setState(1967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1966);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1976);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1969);
					match(T_COMMA);
					setState(1970);
					expr(0);
					setState(1972);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
					case 1:
						{
						setState(1971);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(1978);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSelect_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSelect_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSelect_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1980); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1979);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1982); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(HQLParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(HQLParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(HQLParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(HQLParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(HQLParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(HQLParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HQLParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(HQLParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(HQLParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(HQLParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HQLParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HQLParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(HQLParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSelect_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSelect_options_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSelect_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_select_options_item);
		int _la;
		try {
			setState(1995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				match(T_LIMIT);
				setState(1985);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1986);
				match(T_WITH);
				setState(1987);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 245)) & ~0x3f) == 0 && ((1L << (_la - 245)) & ((1L << (T_RR - 245)) | (1L << (T_RS - 245)) | (1L << (T_UR - 245)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1993);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1988);
					match(T_USE);
					setState(1989);
					match(T_AND);
					setState(1990);
					match(T_KEEP);
					setState(1991);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1992);
					match(T_LOCKS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public TerminalNode NOT() { return getToken(HQLParser.NOT, 0); }
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1998);
					match(T_NOT);
					}
				}

				setState(2001);
				match(T_OPEN_P);
				setState(2002);
				bool_expr(0);
				setState(2003);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2005);
				bool_expr_atom();
				}
				break;
			case 3:
				{
				setState(2007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2006);
					match(NOT);
					}
				}

				setState(2009);
				match(T_OPEN_P);
				setState(2010);
				bool_expr(0);
				setState(2011);
				match(T_CLOSE_P);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(2015);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(2016);
					bool_expr_logical_operator();
					setState(2017);
					bool_expr(4);
					}
					} 
				}
				setState(2023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBool_expr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_bool_expr_atom);
		try {
			setState(2027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2024);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2025);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2026);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(HQLParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(HQLParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HQLParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(HQLParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(HQLParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBool_expr_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_bool_expr_unary);
		int _la;
		try {
			setState(2052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2029);
				expr(0);
				setState(2030);
				match(T_IS);
				setState(2032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2031);
					match(T_NOT);
					}
				}

				setState(2034);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2036);
				expr(0);
				setState(2037);
				match(T_BETWEEN);
				setState(2038);
				expr(0);
				setState(2039);
				match(T_AND);
				setState(2040);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2042);
					match(T_NOT);
					}
				}

				setState(2045);
				match(T_EXISTS);
				setState(2046);
				match(T_OPEN_P);
				setState(2047);
				select_stmt();
				setState(2048);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2050);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2051);
				bool_expr_multi_in();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(HQLParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBool_expr_single_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			expr(0);
			setState(2056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2055);
				match(T_NOT);
				}
			}

			setState(2058);
			match(T_IN);
			setState(2059);
			match(T_OPEN_P);
			setState(2069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				{
				setState(2060);
				expr(0);
				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2061);
					match(T_COMMA);
					setState(2062);
					expr(0);
					}
					}
					setState(2067);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(2068);
				select_stmt();
				}
				break;
			}
			setState(2071);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HQLParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HQLParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HQLParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HQLParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(HQLParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBool_expr_multi_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			match(T_OPEN_P);
			setState(2074);
			expr(0);
			setState(2079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2075);
				match(T_COMMA);
				setState(2076);
				expr(0);
				}
				}
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2082);
			match(T_CLOSE_P);
			setState(2084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(2083);
				match(T_NOT);
				}
			}

			setState(2086);
			match(T_IN);
			setState(2087);
			match(T_OPEN_P);
			setState(2088);
			select_stmt();
			setState(2089);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBool_expr_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2091);
			expr(0);
			setState(2092);
			bool_expr_binary_operator();
			setState(2093);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(HQLParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HQLParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBool_expr_logical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2095);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(HQLParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(HQLParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HQLParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(HQLParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HQLParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HQLParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HQLParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(HQLParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(HQLParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(HQLParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBool_expr_binary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(2109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2097);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2098);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2099);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(2100);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2101);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2102);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(2103);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2104);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2105);
					match(T_NOT);
					}
				}

				setState(2108);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(HQLParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(HQLParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(HQLParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(HQLParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 294;
		enterRecursionRule(_localctx, 294, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(2112);
				match(T_OPEN_P);
				setState(2113);
				select_stmt();
				setState(2114);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2116);
				match(T_OPEN_P);
				setState(2117);
				expr(0);
				setState(2118);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2120);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(2121);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(2122);
				expr_case();
				}
				break;
			case 6:
				{
				setState(2123);
				expr_cursor_attribute();
				}
				break;
			case 7:
				{
				setState(2124);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2125);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2126);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2127);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2130);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2131);
						match(T_MUL);
						setState(2132);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2133);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2134);
						match(T_DIV);
						setState(2135);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2136);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2137);
						match(T_ADD);
						setState(2138);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2139);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2140);
						match(T_SUB);
						setState(2141);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2142);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2143);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_expr_atom);
		try {
			setState(2157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2149);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2150);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2151);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2152);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2153);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2154);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2155);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2156);
				null_const();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(HQLParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_interval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2159);
			match(T_INTERVAL);
			setState(2160);
			expr(0);
			setState(2161);
			interval_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(HQLParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HQLParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HQLParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HQLParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(HQLParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HQLParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitInterval_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(HQLParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(HQLParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(HQLParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(HQLParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_concat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2165);
			expr_concat_item();
			setState(2166);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2167);
			expr_concat_item();
			setState(2172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2168);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2169);
					expr_concat_item();
					}
					} 
				}
				setState(2174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_concat_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_expr_concat_item);
		try {
			setState(2184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				match(T_OPEN_P);
				setState(2176);
				expr(0);
				setState(2177);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2179);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2180);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2181);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2182);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2183);
				expr_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_expr_case);
		try {
			setState(2188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2186);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187);
				expr_case_searched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HQLParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(HQLParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HQLParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HQLParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HQLParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HQLParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(HQLParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_case_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			match(T_CASE);
			setState(2191);
			expr(0);
			setState(2197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2192);
				match(T_WHEN);
				setState(2193);
				expr(0);
				setState(2194);
				match(T_THEN);
				setState(2195);
				expr(0);
				}
				}
				setState(2199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2201);
				match(T_ELSE);
				setState(2202);
				expr(0);
				}
			}

			setState(2205);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HQLParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(HQLParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HQLParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HQLParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HQLParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HQLParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HQLParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_case_searched(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			match(T_CASE);
			setState(2213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2208);
				match(T_WHEN);
				setState(2209);
				bool_expr(0);
				setState(2210);
				match(T_THEN);
				setState(2211);
				expr(0);
				}
				}
				setState(2215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2217);
				match(T_ELSE);
				setState(2218);
				expr(0);
				}
			}

			setState(2221);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ISOPEN() { return getToken(HQLParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(HQLParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HQLParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_cursor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_cursor_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			ident();
			setState(2224);
			match(T__2);
			setState(2225);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(HQLParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HQLParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(HQLParser.T_MUL, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HQLParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HQLParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HQLParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HQLParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(HQLParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(HQLParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HQLParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(HQLParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(HQLParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(HQLParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HQLParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(HQLParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(HQLParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(HQLParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HQLParser.T_VARIANCE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_agg_window_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2227);
				match(T_AVG);
				setState(2228);
				match(T_OPEN_P);
				setState(2230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2229);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2232);
				expr(0);
				setState(2233);
				match(T_CLOSE_P);
				setState(2235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2234);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2237);
				match(T_COUNT);
				setState(2238);
				match(T_OPEN_P);
				setState(2244);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
					case 1:
						{
						setState(2239);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2242);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2243);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2246);
				match(T_CLOSE_P);
				setState(2248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2247);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2250);
				match(T_COUNT_BIG);
				setState(2251);
				match(T_OPEN_P);
				setState(2257);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
					case 1:
						{
						setState(2252);
						expr_func_all_distinct();
						}
						break;
					}
					setState(2255);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2256);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2259);
				match(T_CLOSE_P);
				setState(2261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2260);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2263);
				match(T_CUME_DIST);
				setState(2264);
				match(T_OPEN_P);
				setState(2265);
				match(T_CLOSE_P);
				setState(2266);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2267);
				match(T_DENSE_RANK);
				setState(2268);
				match(T_OPEN_P);
				setState(2269);
				match(T_CLOSE_P);
				setState(2270);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2271);
				match(T_FIRST_VALUE);
				setState(2272);
				match(T_OPEN_P);
				setState(2273);
				expr(0);
				setState(2274);
				match(T_CLOSE_P);
				setState(2275);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2277);
				match(T_LAG);
				setState(2278);
				match(T_OPEN_P);
				setState(2279);
				expr(0);
				setState(2286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2280);
					match(T_COMMA);
					setState(2281);
					expr(0);
					setState(2284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2282);
						match(T_COMMA);
						setState(2283);
						expr(0);
						}
					}

					}
				}

				setState(2288);
				match(T_CLOSE_P);
				setState(2289);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2291);
				match(T_LAST_VALUE);
				setState(2292);
				match(T_OPEN_P);
				setState(2293);
				expr(0);
				setState(2294);
				match(T_CLOSE_P);
				setState(2295);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2297);
				match(T_LEAD);
				setState(2298);
				match(T_OPEN_P);
				setState(2299);
				expr(0);
				setState(2306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2300);
					match(T_COMMA);
					setState(2301);
					expr(0);
					setState(2304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2302);
						match(T_COMMA);
						setState(2303);
						expr(0);
						}
					}

					}
				}

				setState(2308);
				match(T_CLOSE_P);
				setState(2309);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2311);
				match(T_MAX);
				setState(2312);
				match(T_OPEN_P);
				setState(2314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2313);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2316);
				expr(0);
				setState(2317);
				match(T_CLOSE_P);
				setState(2319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2318);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2321);
				match(T_MIN);
				setState(2322);
				match(T_OPEN_P);
				setState(2324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2323);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2326);
				expr(0);
				setState(2327);
				match(T_CLOSE_P);
				setState(2329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2328);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2331);
				match(T_RANK);
				setState(2332);
				match(T_OPEN_P);
				setState(2333);
				match(T_CLOSE_P);
				setState(2334);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2335);
				match(T_ROW_NUMBER);
				setState(2336);
				match(T_OPEN_P);
				setState(2337);
				match(T_CLOSE_P);
				setState(2338);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2339);
				match(T_STDEV);
				setState(2340);
				match(T_OPEN_P);
				setState(2342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2341);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2344);
				expr(0);
				setState(2345);
				match(T_CLOSE_P);
				setState(2347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2346);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2349);
				match(T_SUM);
				setState(2350);
				match(T_OPEN_P);
				setState(2352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2351);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2354);
				expr(0);
				setState(2355);
				match(T_CLOSE_P);
				setState(2357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2356);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2359);
				match(T_VAR);
				setState(2360);
				match(T_OPEN_P);
				setState(2362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2361);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2364);
				expr(0);
				setState(2365);
				match(T_CLOSE_P);
				setState(2367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2366);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2369);
				match(T_VARIANCE);
				setState(2370);
				match(T_OPEN_P);
				setState(2372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2371);
					expr_func_all_distinct();
					}
					break;
				}
				setState(2374);
				expr(0);
				setState(2375);
				match(T_CLOSE_P);
				setState(2377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2376);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HQLParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HQLParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_func_all_distinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(HQLParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_func_over_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2383);
			match(T_OVER);
			setState(2384);
			match(T_OPEN_P);
			setState(2386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2385);
				expr_func_partition_by_clause();
				}
			}

			setState(2389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2388);
				order_by_clause();
				}
			}

			setState(2391);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(HQLParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(HQLParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_func_partition_by_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2393);
			match(T_PARTITION);
			setState(2394);
			match(T_BY);
			setState(2395);
			expr(0);
			setState(2400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2396);
				match(T_COMMA);
				setState(2397);
				expr(0);
				}
				}
				setState(2402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HQLParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(HQLParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HQLParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(HQLParser.T_MUL, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HQLParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(HQLParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(HQLParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HQLParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HQLParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HQLParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(HQLParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(HQLParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HQLParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HQLParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(HQLParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(HQLParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(HQLParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(HQLParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(HQLParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HQLParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HQLParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(HQLParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HQLParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(HQLParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(HQLParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HQLParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_spec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2403);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2404);
				match(T_CAST);
				setState(2405);
				match(T_OPEN_P);
				setState(2406);
				expr(0);
				setState(2407);
				match(T_AS);
				setState(2408);
				dtype();
				setState(2410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2409);
					dtype_len();
					}
				}

				setState(2412);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2414);
				match(T_COUNT);
				setState(2415);
				match(T_OPEN_P);
				setState(2418);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXEC:
				case T_EXECUTE:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FROM:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_GROUP:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INNER:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INTO:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LEFT:
				case T_LIKE:
				case T_LIMIT:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_ORDER:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITH:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					setState(2416);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2417);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2420);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2421);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2422);
				match(T_CURRENT);
				setState(2423);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2427);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2424);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2425);
					match(T_CURRENT);
					setState(2426);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2429);
					match(T_OPEN_P);
					setState(2430);
					expr(0);
					setState(2431);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2435);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2436);
				match(T_CURRENT);
				setState(2437);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2438);
				match(T_MAX_PART_STRING);
				setState(2439);
				match(T_OPEN_P);
				setState(2440);
				expr(0);
				setState(2453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2441);
					match(T_COMMA);
					setState(2442);
					expr(0);
					setState(2450);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2443);
						match(T_COMMA);
						setState(2444);
						expr(0);
						setState(2445);
						match(T_EQUAL);
						setState(2446);
						expr(0);
						}
						}
						setState(2452);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2455);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2457);
				match(T_MIN_PART_STRING);
				setState(2458);
				match(T_OPEN_P);
				setState(2459);
				expr(0);
				setState(2472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2460);
					match(T_COMMA);
					setState(2461);
					expr(0);
					setState(2469);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2462);
						match(T_COMMA);
						setState(2463);
						expr(0);
						setState(2464);
						match(T_EQUAL);
						setState(2465);
						expr(0);
						}
						}
						setState(2471);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2474);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2476);
				match(T_MAX_PART_INT);
				setState(2477);
				match(T_OPEN_P);
				setState(2478);
				expr(0);
				setState(2491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2479);
					match(T_COMMA);
					setState(2480);
					expr(0);
					setState(2488);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2481);
						match(T_COMMA);
						setState(2482);
						expr(0);
						setState(2483);
						match(T_EQUAL);
						setState(2484);
						expr(0);
						}
						}
						setState(2490);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2493);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2495);
				match(T_MIN_PART_INT);
				setState(2496);
				match(T_OPEN_P);
				setState(2497);
				expr(0);
				setState(2510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2498);
					match(T_COMMA);
					setState(2499);
					expr(0);
					setState(2507);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2500);
						match(T_COMMA);
						setState(2501);
						expr(0);
						setState(2502);
						match(T_EQUAL);
						setState(2503);
						expr(0);
						}
						}
						setState(2509);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2512);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2514);
				match(T_MAX_PART_DATE);
				setState(2515);
				match(T_OPEN_P);
				setState(2516);
				expr(0);
				setState(2529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2517);
					match(T_COMMA);
					setState(2518);
					expr(0);
					setState(2526);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2519);
						match(T_COMMA);
						setState(2520);
						expr(0);
						setState(2521);
						match(T_EQUAL);
						setState(2522);
						expr(0);
						}
						}
						setState(2528);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2531);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2533);
				match(T_MIN_PART_DATE);
				setState(2534);
				match(T_OPEN_P);
				setState(2535);
				expr(0);
				setState(2548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2536);
					match(T_COMMA);
					setState(2537);
					expr(0);
					setState(2545);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2538);
						match(T_COMMA);
						setState(2539);
						expr(0);
						setState(2540);
						match(T_EQUAL);
						setState(2541);
						expr(0);
						}
						}
						setState(2547);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2550);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2552);
				match(T_PART_COUNT);
				setState(2553);
				match(T_OPEN_P);
				setState(2554);
				expr(0);
				setState(2562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2555);
					match(T_COMMA);
					setState(2556);
					expr(0);
					setState(2557);
					match(T_EQUAL);
					setState(2558);
					expr(0);
					}
					}
					setState(2564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2565);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2567);
				match(T_PART_LOC);
				setState(2568);
				match(T_OPEN_P);
				setState(2569);
				expr(0);
				setState(2575); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2570);
						match(T_COMMA);
						setState(2571);
						expr(0);
						setState(2572);
						match(T_EQUAL);
						setState(2573);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2577); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2579);
					match(T_COMMA);
					setState(2580);
					expr(0);
					}
				}

				setState(2583);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2585);
				match(T_TRIM);
				setState(2586);
				match(T_OPEN_P);
				setState(2587);
				expr(0);
				setState(2588);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2590);
				match(T_SUBSTRING);
				setState(2591);
				match(T_OPEN_P);
				setState(2592);
				expr(0);
				setState(2593);
				match(T_FROM);
				setState(2594);
				expr(0);
				setState(2597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2595);
					match(T_FOR);
					setState(2596);
					expr(0);
					}
				}

				setState(2599);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2601);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2602);
				match(T_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HQLParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HQLParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2605);
			ident();
			setState(2606);
			match(T_OPEN_P);
			setState(2608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2607);
				expr_func_params();
				}
				break;
			}
			setState(2610);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HQLParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HQLParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitExpr_func_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_expr_func_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			func_param();
			setState(2617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2613);
				match(T_COMMA);
				setState(2614);
				func_param();
				}
				}
				setState(2619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HQLParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HQLParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitFunc_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2620);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2621);
				ident();
				setState(2622);
				match(T_EQUAL);
				setState(2624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2623);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2628);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(HQLParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2630);
			match(T_DATE);
			setState(2631);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(HQLParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitTimestamp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2633);
			match(T_TIMESTAMP);
			setState(2634);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(HQLParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HQLParser.L_ID, i);
		}
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(2636);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXEC:
			case T_EXECUTE:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FROM:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_GROUP:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INNER:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INTO:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LEFT:
			case T_LIKE:
			case T_LIMIT:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_ORDER:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITH:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(2637);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2640);
					match(T__3);
					setState(2643);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(2641);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXEC:
					case T_EXECUTE:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FROM:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_GROUP:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INNER:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INTO:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LEFT:
					case T_LIKE:
					case T_LIMIT:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_ORDER:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITH:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
						{
						setState(2642);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(2649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(HQLParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDouble_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(HQLParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitSingle_quotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_string);
		try {
			setState(2652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2650);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2651);
				match(L_D_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(HQLParser.L_INT, 0); }
		public TerminalNode T_SUB() { return getToken(HQLParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(HQLParser.T_ADD, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitInt_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2654);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2657);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(HQLParser.L_DEC, 0); }
		public TerminalNode T_SUB() { return getToken(HQLParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(HQLParser.T_ADD, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitDec_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2659);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2662);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(HQLParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(HQLParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2664);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HQLParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitNull_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(HQLParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HQLParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(HQLParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(HQLParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(HQLParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(HQLParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(HQLParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(HQLParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HQLParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(HQLParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(HQLParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(HQLParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(HQLParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HQLParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(HQLParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(HQLParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(HQLParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HQLParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(HQLParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HQLParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HQLParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(HQLParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(HQLParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(HQLParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(HQLParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(HQLParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(HQLParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(HQLParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(HQLParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(HQLParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(HQLParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(HQLParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(HQLParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HQLParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(HQLParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(HQLParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(HQLParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(HQLParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(HQLParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(HQLParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HQLParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(HQLParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(HQLParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HQLParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(HQLParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(HQLParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(HQLParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(HQLParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(HQLParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(HQLParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(HQLParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(HQLParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HQLParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(HQLParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(HQLParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(HQLParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(HQLParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HQLParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(HQLParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HQLParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HQLParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HQLParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HQLParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(HQLParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(HQLParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(HQLParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(HQLParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HQLParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(HQLParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HQLParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(HQLParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HQLParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(HQLParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HQLParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HQLParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(HQLParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(HQLParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HQLParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(HQLParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HQLParser.T_DELIMITED, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HQLParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(HQLParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(HQLParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(HQLParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(HQLParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HQLParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HQLParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HQLParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(HQLParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HQLParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(HQLParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HQLParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(HQLParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(HQLParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(HQLParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HQLParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(HQLParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HQLParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(HQLParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HQLParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(HQLParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(HQLParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HQLParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(HQLParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(HQLParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(HQLParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(HQLParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(HQLParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HQLParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(HQLParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(HQLParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(HQLParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(HQLParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(HQLParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(HQLParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(HQLParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HQLParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(HQLParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(HQLParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(HQLParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(HQLParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(HQLParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(HQLParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(HQLParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(HQLParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(HQLParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(HQLParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(HQLParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(HQLParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(HQLParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(HQLParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HQLParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(HQLParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(HQLParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(HQLParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(HQLParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(HQLParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(HQLParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(HQLParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(HQLParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HQLParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HQLParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HQLParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HQLParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HQLParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(HQLParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(HQLParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(HQLParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(HQLParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(HQLParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(HQLParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(HQLParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(HQLParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(HQLParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(HQLParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(HQLParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(HQLParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(HQLParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HQLParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(HQLParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(HQLParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(HQLParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(HQLParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(HQLParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(HQLParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(HQLParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HQLParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HQLParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(HQLParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(HQLParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(HQLParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(HQLParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(HQLParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(HQLParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(HQLParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(HQLParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HQLParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(HQLParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HQLParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HQLParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HQLParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(HQLParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(HQLParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(HQLParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(HQLParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HQLParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(HQLParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HQLParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HQLParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HQLParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(HQLParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(HQLParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HQLParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HQLParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(HQLParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(HQLParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(HQLParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(HQLParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(HQLParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(HQLParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(HQLParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(HQLParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(HQLParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(HQLParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(HQLParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HQLParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(HQLParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HQLParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HQLParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HQLParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(HQLParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(HQLParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HQLParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(HQLParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HQLParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HQLParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(HQLParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(HQLParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HQLParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(HQLParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(HQLParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(HQLParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(HQLParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HQLParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(HQLParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(HQLParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(HQLParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HQLParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(HQLParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(HQLParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(HQLParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(HQLParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HQLParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(HQLParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HQLParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(HQLParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HQLParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(HQLParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(HQLParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(HQLParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(HQLParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(HQLParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(HQLParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(HQLParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(HQLParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HQLParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HQLParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HQLParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(HQLParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HQLParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(HQLParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(HQLParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(HQLParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(HQLParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(HQLParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(HQLParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(HQLParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(HQLParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(HQLParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(HQLParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HQLParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HQLParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HQLParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HQLParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(HQLParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HQLParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HQLParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HQLParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HQLParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(HQLParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(HQLParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(HQLParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(HQLParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(HQLParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(HQLParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(HQLParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(HQLParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HQLParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(HQLParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(HQLParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HQLParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HQLParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(HQLParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(HQLParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HQLParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HQLParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HQLParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(HQLParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HQLParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(HQLParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(HQLParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(HQLParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HQLParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(HQLParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(HQLParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(HQLParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HQLParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HQLParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(HQLParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HQLParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(HQLParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(HQLParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(HQLParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(HQLParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(HQLParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HQLParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HQLParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(HQLParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HQLParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HQLParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(HQLParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(HQLParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(HQLParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(HQLParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HQLParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(HQLParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(HQLParser.T_YES, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HQLListener ) ((HQLListener)listener).exitNon_reserved_words(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HQLVisitor ) return ((HQLVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2668);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 11:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 84:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 119:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 130:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 139:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 147:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 164:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean expr_stmt_sempred(Expr_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("GO");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u017c\u0a71\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\3\2\3\2\3\2\3\3\3\3\5\3\u0164\n\3\3\3"+
		"\5\3\u0167\n\3\6\3\u0169\n\3\r\3\16\3\u016a\3\4\5\4\u016e\n\4\3\4\3\4"+
		"\3\4\5\4\u0173\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u017a\n\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0180\n\5\5\5\u0182\n\5\3\6\3\6\3\6\3\7\3\7\6\7\u0189\n\7\r\7\16\7"+
		"\u018a\3\7\5\7\u018e\n\7\5\7\u0190\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01a6\n\t\3\n\3\n"+
		"\6\n\u01aa\n\n\r\n\16\n\u01ab\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\5\16\u01bc\n\16\3\16\3\16\3\16\7\16\u01c1\n"+
		"\16\f\16\16\16\u01c4\13\16\5\16\u01c6\n\16\3\17\3\17\3\17\5\17\u01cb\n"+
		"\17\3\20\3\20\5\20\u01cf\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u01d8\n\20\3\20\3\20\3\20\5\20\u01dd\n\20\3\21\3\21\3\21\3\21\7\21\u01e3"+
		"\n\21\f\21\16\21\u01e6\13\21\3\21\3\21\5\21\u01ea\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u01f1\n\21\f\21\16\21\u01f4\13\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u01fd\n\22\f\22\16\22\u0200\13\22\3\22\3\22\5\22"+
		"\u0204\n\22\3\22\5\22\u0207\n\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\7\23\u0214\n\23\f\23\16\23\u0217\13\23\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u021e\n\24\f\24\16\24\u0221\13\24\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0228\n\25\3\26\3\26\3\26\7\26\u022d\n\26\f\26\16\26\u0230"+
		"\13\26\3\26\5\26\u0233\n\26\3\26\3\26\5\26\u0237\n\26\3\26\7\26\u023a"+
		"\n\26\f\26\16\26\u023d\13\26\3\26\5\26\u0240\n\26\3\26\3\26\3\26\5\26"+
		"\u0245\n\26\3\26\3\26\5\26\u0249\n\26\3\26\3\26\5\26\u024d\n\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u0257\n\30\3\30\3\30\5\30\u025b"+
		"\n\30\3\30\3\30\3\30\5\30\u0260\n\30\3\31\3\31\3\31\5\31\u0265\n\31\3"+
		"\31\3\31\5\31\u0269\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0276\n\33\3\33\3\33\3\34\5\34\u027b\n\34\3\34\3\34\3"+
		"\34\3\34\5\34\u0281\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u028b\n\35\3\35\3\35\5\35\u028f\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \5 \u02a4\n \3"+
		" \5 \u02a7\n \3 \3 \3 \5 \u02ac\n \3 \3 \3!\5!\u02b1\n!\3!\3!\3!\3!\3"+
		"!\5!\u02b8\n!\3!\3!\3!\3!\3!\5!\u02bf\n!\3!\5!\u02c2\n!\3\"\3\"\3\"\7"+
		"\"\u02c7\n\"\f\"\16\"\u02ca\13\"\3#\3#\3#\5#\u02cf\n#\3#\7#\u02d2\n#\f"+
		"#\16#\u02d5\13#\3#\7#\u02d8\n#\f#\16#\u02db\13#\3#\3#\5#\u02df\n#\3#\5"+
		"#\u02e2\n#\3$\3$\3%\3%\5%\u02e8\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u02f4"+
		"\n%\f%\16%\u02f7\13%\3%\3%\3%\3%\3%\7%\u02fe\n%\f%\16%\u0301\13%\3%\3"+
		"%\3%\5%\u0306\n%\3&\3&\3&\5&\u030b\n&\3&\3&\3&\5&\u0310\n&\3&\3&\3&\5"+
		"&\u0315\n&\7&\u0317\n&\f&\16&\u031a\13&\3&\3&\5&\u031e\n&\3&\5&\u0321"+
		"\n&\3&\3&\3&\3&\3&\3&\7&\u0329\n&\f&\16&\u032c\13&\3&\3&\3&\3&\3&\3&\3"+
		"&\7&\u0335\n&\f&\16&\u0338\13&\3&\3&\7&\u033c\n&\f&\16&\u033f\13&\5&\u0341"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u034d\n\'\3(\6(\u0350"+
		"\n(\r(\16(\u0351\3)\3)\3)\5)\u0357\n)\3*\5*\u035a\n*\3*\3*\3+\6+\u035f"+
		"\n+\r+\16+\u0360\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u036d\n,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\6-\u037a\n-\r-\16-\u037b\3-\3-\3-\5-\u0381\n-\3"+
		".\5.\u0384\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0391\n.\f.\16.\u0394"+
		"\13.\3.\3.\3.\5.\u0399\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u03a4\n.\3/\5"+
		"/\u03a7\n/\3/\3/\3/\3/\3/\3/\7/\u03af\n/\f/\16/\u03b2\13/\3/\3/\3/\3/"+
		"\5/\u03b8\n/\3\60\3\60\3\60\3\60\5\60\u03be\n\60\3\61\3\61\3\61\3\61\7"+
		"\61\u03c4\n\61\f\61\16\61\u03c7\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\5\62\u03d0\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u03e4\n\62\3\63\3\63\3\63"+
		"\3\63\5\63\u03ea\n\63\3\64\3\64\5\64\u03ee\n\64\3\64\3\64\3\64\5\64\u03f3"+
		"\n\64\3\64\3\64\5\64\u03f7\n\64\3\64\3\64\3\64\5\64\u03fc\n\64\3\64\5"+
		"\64\u03ff\n\64\3\64\3\64\3\64\5\64\u0404\n\64\3\64\5\64\u0407\n\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0415\n\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0434\n\65\5\65\u0436\n\65\3\66\3\66\3\66\5\66\u043b\n\66\3"+
		"\66\3\66\5\66\u043f\n\66\3\66\3\66\3\67\5\67\u0444\n\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u044b\n\67\3\67\5\67\u044e\n\67\38\58\u0451\n8\38\38\3"+
		"8\58\u0456\n8\38\38\58\u045a\n8\58\u045c\n8\39\39\39\39\39\59\u0463\n"+
		"9\39\39\79\u0467\n9\f9\169\u046a\139\3:\3:\3:\3:\5:\u0470\n:\3;\3;\3;"+
		"\3;\5;\u0476\n;\3;\3;\3;\7;\u047b\n;\f;\16;\u047e\13;\3;\3;\3<\3<\3<\3"+
		"<\3<\3<\7<\u0488\n<\f<\16<\u048b\13<\5<\u048d\n<\3=\3=\3=\3=\3=\3=\5="+
		"\u0495\n=\3>\3>\7>\u0499\n>\f>\16>\u049c\13>\3>\3>\3?\3?\3?\3?\3?\3?\7"+
		"?\u04a6\n?\f?\16?\u04a9\13?\3?\3?\5?\u04ad\n?\3@\7@\u04b0\n@\f@\16@\u04b3"+
		"\13@\5@\u04b5\n@\3@\5@\u04b8\n@\3A\3A\3A\3A\3A\3A\3A\7A\u04c1\nA\fA\16"+
		"A\u04c4\13A\3A\3A\3B\3B\3B\7B\u04cb\nB\fB\16B\u04ce\13B\3B\3B\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\7C\u04dc\nC\fC\16C\u04df\13C\3C\3C\3D\3D\3E\3E"+
		"\5E\u04e7\nE\3E\3E\3E\5E\u04ec\nE\7E\u04ee\nE\fE\16E\u04f1\13E\5E\u04f3"+
		"\nE\3F\3F\3F\5F\u04f8\nF\3F\3F\3G\3G\3G\3H\3H\3H\5H\u0502\nH\3I\3I\3I"+
		"\5I\u0507\nI\3I\3I\3I\5I\u050c\nI\7I\u050e\nI\fI\16I\u0511\13I\3J\3J\3"+
		"J\5J\u0516\nJ\3K\3K\3K\3K\5K\u051c\nK\3K\3K\3L\3L\3L\3L\3L\3L\5L\u0526"+
		"\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0531\nM\3M\3M\5M\u0535\nM\3N\3N\3N"+
		"\5N\u053a\nN\3O\3O\3O\3O\5O\u0540\nO\3O\5O\u0543\nO\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\5O\u054d\nO\3P\3P\3P\3P\3P\7P\u0554\nP\fP\16P\u0557\13P\3Q\3Q\3"+
		"Q\3Q\5Q\u055d\nQ\3Q\3Q\3Q\3Q\3Q\5Q\u0564\nQ\5Q\u0566\nQ\3R\3R\3R\3R\5"+
		"R\u056c\nR\3R\5R\u056f\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u057a\nR\3S\3"+
		"S\3S\3S\3S\7S\u0581\nS\fS\16S\u0584\13S\3T\3T\3T\5T\u0589\nT\3U\3U\3U"+
		"\3U\5U\u058f\nU\3U\5U\u0592\nU\3U\3U\3U\5U\u0597\nU\3U\5U\u059a\nU\3U"+
		"\5U\u059d\nU\3U\5U\u05a0\nU\3U\5U\u05a3\nU\3U\3U\3U\3U\5U\u05a9\nU\3V"+
		"\3V\3V\3V\3V\3V\7V\u05b1\nV\fV\16V\u05b4\13V\3V\3V\3V\3V\3V\3V\7V\u05bc"+
		"\nV\fV\16V\u05bf\13V\5V\u05c1\nV\3W\3W\3W\3W\3W\5W\u05c8\nW\3W\3W\3W\5"+
		"W\u05cd\nW\3W\7W\u05d0\nW\fW\16W\u05d3\13W\3W\5W\u05d6\nW\3W\3W\3W\3W"+
		"\3W\3W\5W\u05de\nW\3W\3W\5W\u05e2\nW\3W\7W\u05e5\nW\fW\16W\u05e8\13W\3"+
		"W\5W\u05eb\nW\5W\u05ed\nW\3X\6X\u05f0\nX\rX\16X\u05f1\3Y\3Y\3Y\3Y\3Y\3"+
		"Y\5Y\u05fa\nY\3Y\3Y\3Y\5Y\u05ff\nY\3Z\3Z\3Z\5Z\u0604\nZ\3[\3[\3[\3[\3"+
		"[\7[\u060b\n[\f[\16[\u060e\13[\3[\5[\u0611\n[\3[\3[\3[\3\\\3\\\3\\\3\\"+
		"\3\\\5\\\u061b\n\\\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3`\3`\5`"+
		"\u062d\n`\3a\3a\5a\u0631\na\3a\3a\3a\3a\3a\3a\3a\3a\7a\u063b\na\fa\16"+
		"a\u063e\13a\3a\3a\3b\3b\5b\u0644\nb\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\7d\u0652\nd\fd\16d\u0655\13d\3d\3d\7d\u0659\nd\fd\16d\u065c\13d\3e\3"+
		"e\3e\5e\u0661\ne\3f\5f\u0664\nf\3f\3f\5f\u0668\nf\3f\5f\u066b\nf\3f\3"+
		"f\3g\3g\3g\3h\3h\3h\3h\5h\u0676\nh\3h\5h\u0679\nh\3h\3h\3h\3i\3i\3i\3"+
		"i\3i\3i\5i\u0684\ni\3j\3j\3j\3j\5j\u068a\nj\3j\3j\5j\u068e\nj\3j\3j\3"+
		"j\3j\3j\3k\3k\3k\3k\5k\u0699\nk\3k\3k\3k\3k\3k\5k\u06a0\nk\3k\3k\3k\3"+
		"k\3k\3l\3l\3l\3l\3l\3l\5l\u06ad\nl\3m\5m\u06b0\nm\3m\3m\3n\3n\3n\3n\7"+
		"n\u06b8\nn\fn\16n\u06bb\13n\3o\3o\5o\u06bf\no\3o\3o\3o\3o\3o\3p\3p\3p"+
		"\3p\7p\u06ca\np\fp\16p\u06cd\13p\3p\3p\3q\3q\3q\3q\7q\u06d5\nq\fq\16q"+
		"\u06d8\13q\3r\3r\3r\3r\3r\5r\u06df\nr\3s\3s\5s\u06e3\ns\3s\3s\5s\u06e7"+
		"\ns\3s\3s\5s\u06eb\ns\5s\u06ed\ns\3t\3t\3t\5t\u06f2\nt\3t\5t\u06f5\nt"+
		"\3t\5t\u06f8\nt\3t\5t\u06fb\nt\3t\3t\5t\u06ff\nt\3t\5t\u0702\nt\3t\5t"+
		"\u0705\nt\3u\5u\u0708\nu\3u\5u\u070b\nu\3u\3u\3u\7u\u0710\nu\fu\16u\u0713"+
		"\13u\3v\3v\3w\3w\3w\3x\3x\3x\5x\u071d\nx\3x\3x\5x\u0721\nx\3x\5x\u0724"+
		"\nx\3y\3y\5y\u0728\ny\3y\3y\3y\3y\3y\5y\u072f\ny\3z\3z\5z\u0733\nz\3z"+
		"\3z\3{\3{\3{\3{\7{\u073b\n{\f{\16{\u073e\13{\3|\3|\3|\7|\u0743\n|\f|\16"+
		"|\u0746\13|\3}\3}\3}\5}\u074b\n}\3~\3~\5~\u074f\n~\3\177\3\177\3\177\3"+
		"\177\5\177\u0755\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\5\u0080\u075e\n\u0080\3\u0081\5\u0081\u0761\n\u0081\3\u0081\3"+
		"\u0081\3\u0081\5\u0081\u0766\n\u0081\3\u0081\5\u0081\u0769\n\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082\u0771\n\u0082\f\u0082"+
		"\16\u0082\u0774\13\u0082\3\u0082\3\u0082\5\u0082\u0778\n\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u077f\n\u0083\f\u0083\16\u0083"+
		"\u0782\13\u0083\3\u0083\3\u0083\5\u0083\u0786\n\u0083\3\u0084\3\u0084"+
		"\5\u0084\u078a\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084"+
		"\u0791\n\u0084\f\u0084\16\u0084\u0794\13\u0084\3\u0084\5\u0084\u0797\n"+
		"\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\7\u0087\u07a3\n\u0087\f\u0087\16\u0087\u07a6\13\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\5\u008a\u07b2\n\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u07b7\n"+
		"\u008a\7\u008a\u07b9\n\u008a\f\u008a\16\u008a\u07bc\13\u008a\3\u008b\6"+
		"\u008b\u07bf\n\u008b\r\u008b\16\u008b\u07c0\3\u008c\3\u008c\3\u008c\3"+
		"\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u07cc\n\u008c\5"+
		"\u008c\u07ce\n\u008c\3\u008d\3\u008d\5\u008d\u07d2\n\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u07da\n\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\5\u008d\u07e0\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\7\u008d\u07e6\n\u008d\f\u008d\16\u008d\u07e9\13\u008d\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u07ee\n\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u07f3\n"+
		"\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\5\u008f\u07fe\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\5\u008f\u0807\n\u008f\3\u0090\3\u0090\5\u0090\u080b\n"+
		"\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u0812\n\u0090\f"+
		"\u0090\16\u0090\u0815\13\u0090\3\u0090\5\u0090\u0818\n\u0090\3\u0090\3"+
		"\u0090\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u0820\n\u0091\f\u0091\16"+
		"\u0091\u0823\13\u0091\3\u0091\3\u0091\5\u0091\u0827\n\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u083d\n\u0094\3\u0094\5\u0094\u0840\n\u0094\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0853"+
		"\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u0863\n\u0095"+
		"\f\u0095\16\u0095\u0866\13\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\5\u0096\u0870\n\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099"+
		"\u087d\n\u0099\f\u0099\16\u0099\u0880\13\u0099\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u088b\n\u009a"+
		"\3\u009b\3\u009b\5\u009b\u088f\n\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\6\u009c\u0898\n\u009c\r\u009c\16\u009c\u0899"+
		"\3\u009c\3\u009c\5\u009c\u089e\n\u009c\3\u009c\3\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\6\u009d\u08a8\n\u009d\r\u009d\16\u009d"+
		"\u08a9\3\u009d\3\u009d\5\u009d\u08ae\n\u009d\3\u009d\3\u009d\3\u009e\3"+
		"\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\5\u009f\u08b9\n\u009f\3"+
		"\u009f\3\u009f\3\u009f\5\u009f\u08be\n\u009f\3\u009f\3\u009f\3\u009f\5"+
		"\u009f\u08c3\n\u009f\3\u009f\3\u009f\5\u009f\u08c7\n\u009f\3\u009f\3\u009f"+
		"\5\u009f\u08cb\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u08d0\n\u009f\3"+
		"\u009f\3\u009f\5\u009f\u08d4\n\u009f\3\u009f\3\u009f\5\u009f\u08d8\n\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\5\u009f\u08ef\n\u009f\5\u009f\u08f1\n\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0903"+
		"\n\u009f\5\u009f\u0905\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\5\u009f\u090d\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0912\n"+
		"\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0917\n\u009f\3\u009f\3\u009f\3"+
		"\u009f\5\u009f\u091c\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3"+
		"\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0929\n\u009f\3"+
		"\u009f\3\u009f\3\u009f\5\u009f\u092e\n\u009f\3\u009f\3\u009f\3\u009f\5"+
		"\u009f\u0933\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0938\n\u009f\3\u009f"+
		"\3\u009f\3\u009f\5\u009f\u093d\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f"+
		"\u0942\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0947\n\u009f\3\u009f\3"+
		"\u009f\3\u009f\5\u009f\u094c\n\u009f\5\u009f\u094e\n\u009f\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u0955\n\u00a1\3\u00a1\5\u00a1\u0958\n"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\7\u00a2"+
		"\u0961\n\u00a2\f\u00a2\16\u00a2\u0964\13\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u096d\n\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0975\n\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u097e\n\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0984\n\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\7\u00a3\u0993\n\u00a3\f\u00a3\16\u00a3\u0996\13\u00a3\5\u00a3"+
		"\u0998\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u09a6\n\u00a3\f\u00a3"+
		"\16\u00a3\u09a9\13\u00a3\5\u00a3\u09ab\n\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\7\u00a3\u09b9\n\u00a3\f\u00a3\16\u00a3\u09bc\13\u00a3\5\u00a3\u09be\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u09cc\n\u00a3\f\u00a3\16\u00a3"+
		"\u09cf\13\u00a3\5\u00a3\u09d1\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3"+
		"\u09df\n\u00a3\f\u00a3\16\u00a3\u09e2\13\u00a3\5\u00a3\u09e4\n\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u09f2\n\u00a3\f\u00a3\16\u00a3\u09f5"+
		"\13\u00a3\5\u00a3\u09f7\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u0a03\n\u00a3\f\u00a3"+
		"\16\u00a3\u0a06\13\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a3\6\u00a3\u0a12\n\u00a3\r\u00a3\16\u00a3"+
		"\u0a13\3\u00a3\3\u00a3\5\u00a3\u0a18\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a3\5\u00a3\u0a28\n\u00a3\3\u00a3\3\u00a3\3\u00a3\3\u00a3"+
		"\5\u00a3\u0a2e\n\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0a33\n\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u0a3a\n\u00a5\f\u00a5\16"+
		"\u00a5\u0a3d\13\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0a43\n"+
		"\u00a6\5\u00a6\u0a45\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\5\u00a9\u0a51\n\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\5\u00a9\u0a56\n\u00a9\7\u00a9\u0a58\n\u00a9\f\u00a9\16"+
		"\u00a9\u0a5b\13\u00a9\3\u00aa\3\u00aa\5\u00aa\u0a5f\n\u00aa\3\u00ab\5"+
		"\u00ab\u0a62\n\u00ab\3\u00ab\3\u00ab\3\u00ac\5\u00ac\u0a67\n\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\2\4\u0118"+
		"\u0128\u00b0\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\2-\5\2\3"+
		"\4\u015e\u015e\u016f\u016f\4\2cc\u0139\u0139\5\2\17\17uu\u009b\u009b\4"+
		"\2\"\"**\4\288ll\4\2\u00ba\u00ba\u0102\u0102\4\2\20\20TT\4\2QQ\u012e\u012e"+
		"\4\2nn\u00ad\u00ad\4\2QQ\u00da\u00da\4\2MM\u008a\u008a\5\2\u008e\u008e"+
		"\u00b4\u00b4\u00d6\u00d7\4\2\u00af\u00af\u00c1\u00c1\4\2\u00be\u00be\u0141"+
		"\u0141\4\2\u00f5\u00f5\u012b\u012b\4\2\u00b3\u00b3\u0175\u0175\4\2  \'"+
		"\'\4\2%%??\4\2CC\u00fb\u00fb\3\2\u00ec\u00ed\4\2\17\17\u009b\u009b\3\2"+
		"\u00dd\u00de\6\2>>OO\u009a\u009a\u00d3\u00d3\3\2`a\6\2\r\16\u00bf\u00bf"+
		"\u00e2\u00e2\u013f\u013f\3\2\u00c9\u00ca\4\2\u0103\u0103\u0128\u0128\6"+
		"\2\26\26[[\u00b0\u00b0\u0122\u0122\4\2\u00b0\u00b0\u013b\u013b\4\2\37"+
		"\37\u0114\u0114\3\2\u0100\u0101\4\2\t\tYY\5\2zz\u00a4\u00a4\u00ef\u00ef"+
		"\5\2??\u00f7\u00f8\u012f\u012f\5\2jj\u0106\u0106\u012e\u012e\4\2\f\f\u00cd"+
		"\u00cd\5\2\u00a5\u00a5\u00e6\u00e6\u00f0\u00f0\5\2GH\u00b7\u00b8\u00fc"+
		"\u00fd\4\2\65\65\u015d\u015d\5\2xx\u009c\u009c\u00c4\u00c4\4\2\u015a\u015a"+
		"\u0170\u0170\4\2oo\u0129\u0129\20\2\7\32\34RT^bbdln\u00c4\u00c6\u00d7"+
		"\u00d9\u00f4\u00f6\u0109\u010b\u0123\u0125\u012a\u012d\u0138\u013b\u014b"+
		"\u0152\u0159\2\u0bcd\2\u015e\3\2\2\2\4\u0168\3\2\2\2\6\u016d\3\2\2\2\b"+
		"\u0181\3\2\2\2\n\u0183\3\2\2\2\f\u018f\3\2\2\2\16\u0191\3\2\2\2\20\u01a5"+
		"\3\2\2\2\22\u01a7\3\2\2\2\24\u01ad\3\2\2\2\26\u01b3\3\2\2\2\30\u01b5\3"+
		"\2\2\2\32\u01c5\3\2\2\2\34\u01ca\3\2\2\2\36\u01dc\3\2\2\2 \u01de\3\2\2"+
		"\2\"\u0203\3\2\2\2$\u020d\3\2\2\2&\u0218\3\2\2\2(\u0227\3\2\2\2*\u024c"+
		"\3\2\2\2,\u024e\3\2\2\2.\u0256\3\2\2\2\60\u0261\3\2\2\2\62\u026a\3\2\2"+
		"\2\64\u026d\3\2\2\2\66\u027a\3\2\2\28\u0284\3\2\2\2:\u0294\3\2\2\2<\u029c"+
		"\3\2\2\2>\u029f\3\2\2\2@\u02be\3\2\2\2B\u02c3\3\2\2\2D\u02e1\3\2\2\2F"+
		"\u02e3\3\2\2\2H\u0305\3\2\2\2J\u0340\3\2\2\2L\u0342\3\2\2\2N\u034f\3\2"+
		"\2\2P\u0356\3\2\2\2R\u0359\3\2\2\2T\u035e\3\2\2\2V\u036c\3\2\2\2X\u0380"+
		"\3\2\2\2Z\u03a3\3\2\2\2\\\u03b7\3\2\2\2^\u03bd\3\2\2\2`\u03bf\3\2\2\2"+
		"b\u03e3\3\2\2\2d\u03e9\3\2\2\2f\u0406\3\2\2\2h\u0435\3\2\2\2j\u0437\3"+
		"\2\2\2l\u044d\3\2\2\2n\u045b\3\2\2\2p\u045d\3\2\2\2r\u046f\3\2\2\2t\u0471"+
		"\3\2\2\2v\u0481\3\2\2\2x\u0494\3\2\2\2z\u0496\3\2\2\2|\u049f\3\2\2\2~"+
		"\u04b4\3\2\2\2\u0080\u04b9\3\2\2\2\u0082\u04c7\3\2\2\2\u0084\u04d1\3\2"+
		"\2\2\u0086\u04e2\3\2\2\2\u0088\u04f2\3\2\2\2\u008a\u04f4\3\2\2\2\u008c"+
		"\u04fb\3\2\2\2\u008e\u0501\3\2\2\2\u0090\u0503\3\2\2\2\u0092\u0512\3\2"+
		"\2\2\u0094\u051b\3\2\2\2\u0096\u051f\3\2\2\2\u0098\u0530\3\2\2\2\u009a"+
		"\u0536\3\2\2\2\u009c\u0542\3\2\2\2\u009e\u054e\3\2\2\2\u00a0\u0565\3\2"+
		"\2\2\u00a2\u056e\3\2\2\2\u00a4\u057b\3\2\2\2\u00a6\u0588\3\2\2\2\u00a8"+
		"\u0591\3\2\2\2\u00aa\u05c0\3\2\2\2\u00ac\u05ec\3\2\2\2\u00ae\u05ef\3\2"+
		"\2\2\u00b0\u05fe\3\2\2\2\u00b2\u0603\3\2\2\2\u00b4\u0605\3\2\2\2\u00b6"+
		"\u0615\3\2\2\2\u00b8\u061c\3\2\2\2\u00ba\u0622\3\2\2\2\u00bc\u0627\3\2"+
		"\2\2\u00be\u062a\3\2\2\2\u00c0\u062e\3\2\2\2\u00c2\u0641\3\2\2\2\u00c4"+
		"\u0645\3\2\2\2\u00c6\u0647\3\2\2\2\u00c8\u0660\3\2\2\2\u00ca\u0667\3\2"+
		"\2\2\u00cc\u066e\3\2\2\2\u00ce\u0671\3\2\2\2\u00d0\u067d\3\2\2\2\u00d2"+
		"\u0685\3\2\2\2\u00d4\u0694\3\2\2\2\u00d6\u06ac\3\2\2\2\u00d8\u06af\3\2"+
		"\2\2\u00da\u06b3\3\2\2\2\u00dc\u06bc\3\2\2\2\u00de\u06c5\3\2\2\2\u00e0"+
		"\u06d0\3\2\2\2\u00e2\u06de\3\2\2\2\u00e4\u06ec\3\2\2\2\u00e6\u06ee\3\2"+
		"\2\2\u00e8\u0707\3\2\2\2\u00ea\u0714\3\2\2\2\u00ec\u0716\3\2\2\2\u00ee"+
		"\u0723\3\2\2\2\u00f0\u072e\3\2\2\2\u00f2\u0732\3\2\2\2\u00f4\u0736\3\2"+
		"\2\2\u00f6\u073f\3\2\2\2\u00f8\u074a\3\2\2\2\u00fa\u074c\3\2\2\2\u00fc"+
		"\u0750\3\2\2\2\u00fe\u075d\3\2\2\2\u0100\u0768\3\2\2\2\u0102\u076a\3\2"+
		"\2\2\u0104\u0785\3\2\2\2\u0106\u0787\3\2\2\2\u0108\u0798\3\2\2\2\u010a"+
		"\u079a\3\2\2\2\u010c\u079d\3\2\2\2\u010e\u07a7\3\2\2\2\u0110\u07aa\3\2"+
		"\2\2\u0112\u07ad\3\2\2\2\u0114\u07be\3\2\2\2\u0116\u07cd\3\2\2\2\u0118"+
		"\u07df\3\2\2\2\u011a\u07ed\3\2\2\2\u011c\u0806\3\2\2\2\u011e\u0808\3\2"+
		"\2\2\u0120\u081b\3\2\2\2\u0122\u082d\3\2\2\2\u0124\u0831\3\2\2\2\u0126"+
		"\u083f\3\2\2\2\u0128\u0852\3\2\2\2\u012a\u086f\3\2\2\2\u012c\u0871\3\2"+
		"\2\2\u012e\u0875\3\2\2\2\u0130\u0877\3\2\2\2\u0132\u088a\3\2\2\2\u0134"+
		"\u088e\3\2\2\2\u0136\u0890\3\2\2\2\u0138\u08a1\3\2\2\2\u013a\u08b1\3\2"+
		"\2\2\u013c\u094d\3\2\2\2\u013e\u094f\3\2\2\2\u0140\u0951\3\2\2\2\u0142"+
		"\u095b\3\2\2\2\u0144\u0a2d\3\2\2\2\u0146\u0a2f\3\2\2\2\u0148\u0a36\3\2"+
		"\2\2\u014a\u0a3e\3\2\2\2\u014c\u0a48\3\2\2\2\u014e\u0a4b\3\2\2\2\u0150"+
		"\u0a50\3\2\2\2\u0152\u0a5e\3\2\2\2\u0154\u0a61\3\2\2\2\u0156\u0a66\3\2"+
		"\2\2\u0158\u0a6a\3\2\2\2\u015a\u0a6c\3\2\2\2\u015c\u0a6e\3\2\2\2\u015e"+
		"\u015f\5\4\3\2\u015f\u0160\7\2\2\3\u0160\3\3\2\2\2\u0161\u0164\5\6\4\2"+
		"\u0162\u0164\5\20\t\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0166"+
		"\3\2\2\2\u0165\u0167\7~\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0163\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\5\3\2\2\2\u016c\u016e\5$\23\2\u016d\u016c"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\26\2\2"+
		"\u0170\u0172\5\4\3\2\u0171\u0173\5\22\n\2\u0172\u0171\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\5\n\6\2\u0175\7\3\2\2\2\u0176"+
		"\u0177\7\26\2\2\u0177\u0179\5\4\3\2\u0178\u017a\5\22\n\2\u0179\u0178\3"+
		"\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\5\n\6\2\u017c"+
		"\u0182\3\2\2\2\u017d\u017f\5\20\t\2\u017e\u0180\7\u016f\2\2\u017f\u017e"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0176\3\2\2\2\u0181"+
		"\u017d\3\2\2\2\u0182\t\3\2\2\2\u0183\u0184\6\6\2\2\u0184\u0185\7c\2\2"+
		"\u0185\13\3\2\2\2\u0186\u0190\5\6\4\2\u0187\u0189\5\20\t\2\u0188\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018e\7~\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u0190\3\2\2\2\u018f\u0186\3\2\2\2\u018f\u0188\3\2\2\2\u0190"+
		"\r\3\2\2\2\u0191\u0192\t\2\2\2\u0192\17\3\2\2\2\u0193\u01a6\5\32\16\2"+
		"\u0194\u01a6\5\u00be`\2\u0195\u01a6\5p9\2\u0196\u01a6\5t;\2\u0197\u01a6"+
		"\5\u00c0a\2\u0198\u01a6\5> \2\u0199\u01a6\5\u009cO\2\u019a\u01a6\5\u00a2"+
		"R\2\u019b\u01a6\5\u00a8U\2\u019c\u01a6\58\35\2\u019d\u01a6\5\u00d2j\2"+
		"\u019e\u01a6\5\u00d4k\2\u019f\u01a6\5\u00b2Z\2\u01a0\u01a6\5\u00d8m\2"+
		"\u01a1\u01a6\5\u00d0i\2\u01a2\u01a6\5\26\f\2\u01a3\u01a6\5\30\r\2\u01a4"+
		"\u01a6\5\16\b\2\u01a5\u0193\3\2\2\2\u01a5\u0194\3\2\2\2\u01a5\u0195\3"+
		"\2\2\2\u01a5\u0196\3\2\2\2\u01a5\u0197\3\2\2\2\u01a5\u0198\3\2\2\2\u01a5"+
		"\u0199\3\2\2\2\u01a5\u019a\3\2\2\2\u01a5\u019b\3\2\2\2\u01a5\u019c\3\2"+
		"\2\2\u01a5\u019d\3\2\2\2\u01a5\u019e\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5"+
		"\u01a0\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a5\u01a4\3\2\2\2\u01a6\21\3\2\2\2\u01a7\u01a9\7i\2\2\u01a8\u01aa"+
		"\5\24\13\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2"+
		"\u01ab\u01ac\3\2\2\2\u01ac\23\3\2\2\2\u01ad\u01ae\7\u0139\2\2\u01ae\u01af"+
		"\7\u0172\2\2\u01af\u01b0\7\u0122\2\2\u01b0\u01b1\5\4\3\2\u01b1\u01b2\n"+
		"\3\2\2\u01b2\25\3\2\2\2\u01b3\u01b4\7\u00c5\2\2\u01b4\27\3\2\2\2\u01b5"+
		"\u01b6\6\r\3\2\u01b6\u01b7\5\u0128\u0095\2\u01b7\31\3\2\2\2\u01b8\u01b9"+
		"\7\u0102\2\2\u01b9\u01c6\5\u00c8e\2\u01ba\u01bc\7\u0102\2\2\u01bb\u01ba"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c2\5\34\17\2"+
		"\u01be\u01bf\7\u015c\2\2\u01bf\u01c1\5\34\17\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01b8\3\2\2\2\u01c5\u01bb\3\2\2\2\u01c6"+
		"\33\3\2\2\2\u01c7\u01cb\5\36\20\2\u01c8\u01cb\5 \21\2\u01c9\u01cb\5\""+
		"\22\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb"+
		"\35\3\2\2\2\u01cc\u01ce\5\u0150\u00a9\2\u01cd\u01cf\7\u015b\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7\u0160"+
		"\2\2\u01d1\u01d2\5\u0128\u0095\2\u01d2\u01dd\3\2\2\2\u01d3\u01d4\7\u016a"+
		"\2\2\u01d4\u01d5\5\u0150\u00a9\2\u01d5\u01d7\7\u016d\2\2\u01d6\u01d8\7"+
		"\u015b\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2"+
		"\u01d9\u01da\7\u0160\2\2\u01da\u01db\5\u0128\u0095\2\u01db\u01dd\3\2\2"+
		"\2\u01dc\u01cc\3\2\2\2\u01dc\u01d3\3\2\2\2\u01dd\37\3\2\2\2\u01de\u01df"+
		"\7\u016a\2\2\u01df\u01e4\5\u0150\u00a9\2\u01e0\u01e1\7\u015c\2\2\u01e1"+
		"\u01e3\5\u0150\u00a9\2\u01e2\u01e0\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2"+
		"\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7"+
		"\u01e9\7\u016d\2\2\u01e8\u01ea\7\u015b\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\7\u0160\2\2\u01ec\u01ed\7\u016a"+
		"\2\2\u01ed\u01f2\5\u0128\u0095\2\u01ee\u01ef\7\u015c\2\2\u01ef\u01f1\5"+
		"\u0128\u0095\2\u01f0\u01ee\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5"+
		"\u01f6\7\u016d\2\2\u01f6!\3\2\2\2\u01f7\u0204\5\u0150\u00a9\2\u01f8\u01f9"+
		"\7\u016a\2\2\u01f9\u01fe\5\u0150\u00a9\2\u01fa\u01fb\7\u015c\2\2\u01fb"+
		"\u01fd\5\u0150\u00a9\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201"+
		"\u0202\7\u016d\2\2\u0202\u0204\3\2\2\2\u0203\u01f7\3\2\2\2\u0203\u01f8"+
		"\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0207\7\u015b\2\2\u0206\u0205\3\2\2"+
		"\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7\u0160\2\2\u0209"+
		"\u020a\7\u016a\2\2\u020a\u020b\5\u00d8m\2\u020b\u020c\7\u016d\2\2\u020c"+
		"#\3\2\2\2\u020d\u020e\7K\2\2\u020e\u020f\5(\25\2\u020f\u0215\7\u016f\2"+
		"\2\u0210\u0211\5(\25\2\u0211\u0212\7\u016f\2\2\u0212\u0214\3\2\2\2\u0213"+
		"\u0210\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216%\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219\5(\25\2\u0219\u021f"+
		"\7\u016f\2\2\u021a\u021b\5(\25\2\u021b\u021c\7\u016f\2\2\u021c\u021e\3"+
		"\2\2\2\u021d\u021a\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\'\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0228\5.\30\2"+
		"\u0223\u0228\5,\27\2\u0224\u0228\5\64\33\2\u0225\u0228\5*\26\2\u0226\u0228"+
		"\5\66\34\2\u0227\u0222\3\2\2\2\u0227\u0223\3\2\2\2\u0227\u0224\3\2\2\2"+
		"\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228)\3\2\2\2\u0229\u022e\5"+
		"\u0150\u00a9\2\u022a\u022b\7\u015c\2\2\u022b\u022d\5\u0150\u00a9\2\u022c"+
		"\u022a\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2"+
		"\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0233\7\17\2\2\u0232"+
		"\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\5h"+
		"\65\2\u0235\u0237\5j\66\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u023b\3\2\2\2\u0238\u023a\5l\67\2\u0239\u0238\3\2\2\2\u023a\u023d\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023e\u0240\5n8\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2"+
		"\2\u0240\u024d\3\2\2\2\u0241\u0242\5\u0150\u00a9\2\u0242\u0244\7\62\2"+
		"\2\u0243\u0245\7\17\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0248\5h\65\2\u0247\u0249\5j\66\2\u0248\u0247\3\2"+
		"\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\5n8\2\u024b\u024d"+
		"\3\2\2\2\u024c\u0229\3\2\2\2\u024c\u0241\3\2\2\2\u024d+\3\2\2\2\u024e"+
		"\u024f\5\u0150\u00a9\2\u024f\u0250\7\66\2\2\u0250-\3\2\2\2\u0251\u0252"+
		"\7B\2\2\u0252\u0257\5\u0150\u00a9\2\u0253\u0254\5\u0150\u00a9\2\u0254"+
		"\u0255\7B\2\2\u0255\u0257\3\2\2\2\u0256\u0251\3\2\2\2\u0256\u0253\3\2"+
		"\2\2\u0257\u025a\3\2\2\2\u0258\u025b\5\60\31\2\u0259\u025b\5\62\32\2\u025a"+
		"\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u025f\t\4\2\2\u025d\u0260\5\u00d8m\2\u025e\u0260\5\u0128\u0095"+
		"\2\u025f\u025d\3\2\2\2\u025f\u025e\3\2\2\2\u0260/\3\2\2\2\u0261\u0262"+
		"\7\u013c\2\2\u0262\u0264\7\u00ec\2\2\u0263\u0265\7\u00cb\2\2\u0264\u0263"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0267\7\u0126\2"+
		"\2\u0267\u0269\t\5\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\61"+
		"\3\2\2\2\u026a\u026b\7\u013d\2\2\u026b\u026c\7\u00ec\2\2\u026c\63\3\2"+
		"\2\2\u026d\u026e\t\6\2\2\u026e\u026f\7\u0081\2\2\u026f\u0275\7u\2\2\u0270"+
		"\u0276\7\u010e\2\2\u0271\u0276\7\u0111\2\2\u0272\u0273\7\u00c3\2\2\u0273"+
		"\u0276\7x\2\2\u0274\u0276\5\u0150\u00a9\2\u0275\u0270\3\2\2\2\u0275\u0271"+
		"\3\2\2\2\u0275\u0272\3\2\2\2\u0275\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0278\5\b\5\2\u0278\65\3\2\2\2\u0279\u027b\7}\2\2\u027a\u0279\3\2\2\2"+
		"\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\7\u011f\2\2\u027d"+
		"\u027e\7\u011d\2\2\u027e\u0280\5\u0150\u00a9\2\u027f\u0281\5N(\2\u0280"+
		"\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\5@"+
		"!\2\u0283\67\3\2\2\2\u0284\u0285\7<\2\2\u0285\u0286\7m\2\2\u0286\u028a"+
		"\7\u011d\2\2\u0287\u0288\7\u0088\2\2\u0288\u0289\7\u00c3\2\2\u0289\u028b"+
		"\7k\2\2\u028a\u0287\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028e\5\u0108\u0085\2\u028d\u028f\5N(\2\u028e\u028d\3\2\2\2\u028e\u028f"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\5@!\2\u0291\u0292\5:\36\2\u0292"+
		"\u0293\5<\37\2\u02939\3\2\2\2\u0294\u0295\7\u00f3\2\2\u0295\u0296\7w\2"+
		"\2\u0296\u0297\7R\2\2\u0297\u0298\7q\2\2\u0298\u0299\7\u0120\2\2\u0299"+
		"\u029a\7\37\2\2\u029a\u029b\7\u0171\2\2\u029b;\3\2\2\2\u029c\u029d\7\u00a9"+
		"\2\2\u029d\u029e\7\u017a\2\2\u029e=\3\2\2\2\u029f\u02a6\7<\2\2\u02a0\u02a1"+
		"\7\u00a8\2\2\u02a1\u02a7\7\u011f\2\2\u02a2\u02a4\t\7\2\2\u02a3\u02a2\3"+
		"\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\7\u0138\2\2"+
		"\u02a6\u02a0\3\2\2\2\u02a6\u02a3\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9"+
		"\7\u011d\2\2\u02a9\u02ab\5\u0150\u00a9\2\u02aa\u02ac\5N(\2\u02ab\u02aa"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\5@!\2\u02ae"+
		"?\3\2\2\2\u02af\u02b1\7\17\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2"+
		"\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\u016a\2\2\u02b3\u02b4\5\u00d8m\2\u02b4"+
		"\u02b5\7\u016d\2\2\u02b5\u02bf\3\2\2\2\u02b6\u02b8\7\17\2\2\u02b7\u02b6"+
		"\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bf\5\u00d8m"+
		"\2\u02ba\u02bb\7\u016a\2\2\u02bb\u02bc\5B\"\2\u02bc\u02bd\7\u016d\2\2"+
		"\u02bd\u02bf\3\2\2\2\u02be\u02b0\3\2\2\2\u02be\u02b7\3\2\2\2\u02be\u02ba"+
		"\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02c2\5T+\2\u02c1\u02c0\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2A\3\2\2\2\u02c3\u02c8\5D#\2\u02c4\u02c5\7\u015c\2"+
		"\2\u02c5\u02c7\5D#\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9C\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb"+
		"\u02cc\5F$\2\u02cc\u02ce\5h\65\2\u02cd\u02cf\5j\66\2\u02ce\u02cd\3\2\2"+
		"\2\u02ce\u02cf\3\2\2\2\u02cf\u02d3\3\2\2\2\u02d0\u02d2\5l\67\2\u02d1\u02d0"+
		"\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d9\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d8\5H%\2\u02d7\u02d6\3\2\2"+
		"\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02e2"+
		"\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd\7\67\2\2\u02dd\u02df\5\u0150"+
		"\u00a9\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e2\5J&\2\u02e1\u02cb\3\2\2\2\u02e1\u02de\3\2\2\2\u02e2E\3\2\2\2\u02e3"+
		"\u02e4\5\u0150\u00a9\2\u02e4G\3\2\2\2\u02e5\u0306\5n8\2\u02e6\u02e8\7"+
		"\u00c3\2\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2"+
		"\u02e9\u0306\7\u00c5\2\2\u02ea\u02eb\7\u00db\2\2\u02eb\u0306\7\u00a0\2"+
		"\2\u02ec\u0306\7\u012d\2\2\u02ed\u02ee\7\u00e5\2\2\u02ee\u02ef\5\u0108"+
		"\u0085\2\u02ef\u02f0\7\u016a\2\2\u02f0\u02f1\5\u0150\u00a9\2\u02f1\u02f5"+
		"\7\u016d\2\2\u02f2\u02f4\5L\'\2\u02f3\u02f2\3\2\2\2\u02f4\u02f7\3\2\2"+
		"\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u0306\3\2\2\2\u02f7\u02f5"+
		"\3\2\2\2\u02f8\u02f9\7\u0087\2\2\u02f9\u02fa\7\u016a\2\2\u02fa\u02ff\7"+
		"\u0175\2\2\u02fb\u02fc\7\u015c\2\2\u02fc\u02fe\7\u0175\2\2\u02fd\u02fb"+
		"\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0302\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u0306\7\u016d\2\2\u0303\u0306"+
		"\7\23\2\2\u0304\u0306\7b\2\2\u0305\u02e5\3\2\2\2\u0305\u02e7\3\2\2\2\u0305"+
		"\u02ea\3\2\2\2\u0305\u02ec\3\2\2\2\u0305\u02ed\3\2\2\2\u0305\u02f8\3\2"+
		"\2\2\u0305\u0303\3\2\2\2\u0305\u0304\3\2\2\2\u0306I\3\2\2\2\u0307\u0308"+
		"\7\u00db\2\2\u0308\u030a\7\u00a0\2\2\u0309\u030b\7,\2\2\u030a\u0309\3"+
		"\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\7\u016a\2\2"+
		"\u030d\u030f\5\u0150\u00a9\2\u030e\u0310\t\b\2\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0318\3\2\2\2\u0311\u0312\7\u015c\2\2\u0312\u0314"+
		"\5\u0150\u00a9\2\u0313\u0315\t\b\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3"+
		"\2\2\2\u0315\u0317\3\2\2\2\u0316\u0311\3\2\2\2\u0317\u031a\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u0318\3\2"+
		"\2\2\u031b\u031d\7\u016d\2\2\u031c\u031e\7b\2\2\u031d\u031c\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u0321\5\u00c4c\2\u0320\u031f"+
		"\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0341\3\2\2\2\u0322\u0323\7v\2\2\u0323"+
		"\u0324\7\u00a0\2\2\u0324\u0325\7\u016a\2\2\u0325\u032a\5\u0150\u00a9\2"+
		"\u0326\u0327\7\u015c\2\2\u0327\u0329\5\u0150\u00a9\2\u0328\u0326\3\2\2"+
		"\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d"+
		"\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032e\7\u016d\2\2\u032e\u032f\7\u00e5"+
		"\2\2\u032f\u0330\5\u0108\u0085\2\u0330\u0331\7\u016a\2\2\u0331\u0336\5"+
		"\u0150\u00a9\2\u0332\u0333\7\u015c\2\2\u0333\u0335\5\u0150\u00a9\2\u0334"+
		"\u0332\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2"+
		"\2\2\u0337\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033d\7\u016d\2\2\u033a"+
		"\u033c\5L\'\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2"+
		"\2\2\u033d\u033e\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u0340"+
		"\u0307\3\2\2\2\u0340\u0322\3\2\2\2\u0341K\3\2\2\2\u0342\u0343\7\u00ca"+
		"\2\2\u0343\u034c\t\t\2\2\u0344\u0345\7\u00be\2\2\u0345\u034d\7\7\2\2\u0346"+
		"\u034d\7\u00e9\2\2\u0347\u0348\7\u0102\2\2\u0348\u034d\7\u00c5\2\2\u0349"+
		"\u034a\7\u0102\2\2\u034a\u034d\7L\2\2\u034b\u034d\7#\2\2\u034c\u0344\3"+
		"\2\2\2\u034c\u0346\3\2\2\2\u034c\u0347\3\2\2\2\u034c\u0349\3\2\2\2\u034c"+
		"\u034b\3\2\2\2\u034dM\3\2\2\2\u034e\u0350\5P)\2\u034f\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352O\3\2\2\2"+
		"\u0353\u0354\7\u015c\2\2\u0354\u0357\5R*\2\u0355\u0357\5^\60\2\u0356\u0353"+
		"\3\2\2\2\u0356\u0355\3\2\2\2\u0357Q\3\2\2\2\u0358\u035a\7\u00be\2\2\u0359"+
		"\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\t\n"+
		"\2\2\u035cS\3\2\2\2\u035d\u035f\5V,\2\u035e\u035d\3\2\2\2\u035f\u0360"+
		"\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361U\3\2\2\2\u0362"+
		"\u0363\7\u00ca\2\2\u0363\u0364\7\63\2\2\u0364\u0365\t\13\2\2\u0365\u036d"+
		"\7\u00f4\2\2\u0366\u036d\5X-\2\u0367\u036d\5Z.\2\u0368\u036d\5\\/\2\u0369"+
		"\u036d\5^\60\2\u036a\u036d\5d\63\2\u036b\u036d\5f\64\2\u036c\u0362\3\2"+
		"\2\2\u036c\u0366\3\2\2\2\u036c\u0367\3\2\2\2\u036c\u0368\3\2\2\2\u036c"+
		"\u0369\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036b\3\2\2\2\u036dW\3\2\2\2"+
		"\u036e\u036f\7\u00ff\2\2\u036f\u0370\7=\2\2\u0370\u0381\t\f\2\2\u0371"+
		"\u0372\t\r\2\2\u0372\u0381\7\u0175\2\2\u0373\u0381\7\u00c0\2\2\u0374\u0381"+
		"\t\16\2\2\u0375\u0376\7\u0115\2\2\u0376\u0379\7\u016a\2\2\u0377\u037a"+
		"\5\u0150\u00a9\2\u0378\u037a\7\u0175\2\2\u0379\u0377\3\2\2\2\u0379\u0378"+
		"\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u0381\7\u016d\2\2\u037e\u037f\7\u011e\2\2\u037f\u0381"+
		"\5\u0150\u00a9\2\u0380\u036e\3\2\2\2\u0380\u0371\3\2\2\2\u0380\u0373\3"+
		"\2\2\2\u0380\u0374\3\2\2\2\u0380\u0375\3\2\2\2\u0380\u037e\3\2\2\2\u0381"+
		"Y\3\2\2\2\u0382\u0384\7\u008d\2\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385\u0386\7\u008b\2\2\u0386\u03a4\5\u0150\u00a9"+
		"\2\u0387\u0388\7\u013c\2\2\u0388\u03a4\7\u00e7\2\2\u0389\u038a\7Z\2\2"+
		"\u038a\u038b\7\37\2\2\u038b\u038c\7\u0082\2\2\u038c\u038d\7\u016a\2\2"+
		"\u038d\u0392\5\u0150\u00a9\2\u038e\u038f\7\u015c\2\2\u038f\u0391\5\u0150"+
		"\u00a9\2\u0390\u038e\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0396\7\u016d"+
		"\2\2\u0396\u03a4\3\2\2\2\u0397\u0399\7\u00c3\2\2\u0398\u0397\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u03a4\7\u00ae\2\2\u039b\u039c"+
		"\7\64\2\2\u039c\u03a4\t\17\2\2\u039d\u039e\7P\2\2\u039e\u03a4\7\u00cb"+
		"\2\2\u039f\u03a0\7\u013c\2\2\u03a0\u03a1\7\u00e9\2\2\u03a1\u03a2\7\u00ca"+
		"\2\2\u03a2\u03a4\7]\2\2\u03a3\u0383\3\2\2\2\u03a3\u0387\3\2\2\2\u03a3"+
		"\u0389\3\2\2\2\u03a3\u0398\3\2\2\2\u03a3\u039b\3\2\2\2\u03a3\u039d\3\2"+
		"\2\2\u03a3\u039f\3\2\2\2\u03a4[\3\2\2\2\u03a5\u03a7\7\u012d\2\2\u03a6"+
		"\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\7\u00db"+
		"\2\2\u03a9\u03aa\7\u008d\2\2\u03aa\u03ab\7\u016a\2\2\u03ab\u03b0\5\u0150"+
		"\u00a9\2\u03ac\u03ad\7\u015c\2\2\u03ad\u03af\5\u0150\u00a9\2\u03ae\u03ac"+
		"\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"\u03b3\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b4\7\u016d\2\2\u03b4\u03b8"+
		"\3\2\2\2\u03b5\u03b6\7\u013c\2\2\u03b6\u03b8\7D\2\2\u03b7\u03a6\3\2\2"+
		"\2\u03b7\u03b5\3\2\2\2\u03b8]\3\2\2\2\u03b9\u03be\5`\61\2\u03ba\u03bb"+
		"\7\u0116\2\2\u03bb\u03bc\7\17\2\2\u03bc\u03be\5\u0150\u00a9\2\u03bd\u03b9"+
		"\3\2\2\2\u03bd\u03ba\3\2\2\2\u03be_\3\2\2\2\u03bf\u03c0\7\u00f3\2\2\u03c0"+
		"\u03c1\7w\2\2\u03c1\u03c5\7R\2\2\u03c2\u03c4\5b\62\2\u03c3\u03c2\3\2\2"+
		"\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6a"+
		"\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03c9\7q\2\2\u03c9\u03ca\7\u0120\2"+
		"\2\u03ca\u03cb\7\37\2\2\u03cb\u03cf\5\u0128\u0095\2\u03cc\u03cd\7e\2\2"+
		"\u03cd\u03ce\7\37\2\2\u03ce\u03d0\5\u0128\u0095\2\u03cf\u03cc\3\2\2\2"+
		"\u03cf\u03d0\3\2\2\2\u03d0\u03e4\3\2\2\2\u03d1\u03d2\7/\2\2\u03d2\u03d3"+
		"\7\u009d\2\2\u03d3\u03d4\7\u0120\2\2\u03d4\u03d5\7\37\2\2\u03d5\u03e4"+
		"\5\u0128\u0095\2\u03d6\u03d7\7\u00b1\2\2\u03d7\u03d8\7\u00a1\2\2\u03d8"+
		"\u03d9\7\u0120\2\2\u03d9\u03da\7\37\2\2\u03da\u03e4\5\u0128\u0095\2\u03db"+
		"\u03dc\7\u00a7\2\2\u03dc\u03dd\7\u0120\2\2\u03dd\u03de\7\37\2\2\u03de"+
		"\u03e4\5\u0128\u0095\2\u03df\u03e0\7\u00c5\2\2\u03e0\u03e1\7N\2\2\u03e1"+
		"\u03e2\7\17\2\2\u03e2\u03e4\5\u0128\u0095\2\u03e3\u03c8\3\2\2\2\u03e3"+
		"\u03d1\3\2\2\2\u03e3\u03d6\3\2\2\2\u03e3\u03db\3\2\2\2\u03e3\u03df\3\2"+
		"\2\2\u03e4c\3\2\2\2\u03e5\u03e6\7\u00ca\2\2\u03e6\u03ea\5\u0150\u00a9"+
		"\2\u03e7\u03e8\7\u0121\2\2\u03e8\u03ea\5\u0150\u00a9\2\u03e9\u03e5\3\2"+
		"\2\2\u03e9\u03e7\3\2\2\2\u03eae\3\2\2\2\u03eb\u03ed\7\23\2\2\u03ec\u03ee"+
		"\7\u0160\2\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2\2"+
		"\2\u03ef\u0407\5\u0128\u0095\2\u03f0\u03f2\7\61\2\2\u03f1\u03f3\7\u0160"+
		"\2\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u0407\5\u0128\u0095\2\u03f5\u03f7\7L\2\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7"+
		"\3\2\2\2\u03f7\u03fb\3\2\2\2\u03f8\u03f9\7(\2\2\u03f9\u03fc\7\u0102\2"+
		"\2\u03fa\u03fc\7)\2\2\u03fb\u03f8\3\2\2\2\u03fb\u03fa\3\2\2\2\u03fc\u03fe"+
		"\3\2\2\2\u03fd\u03ff\7\u0160\2\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2"+
		"\2\u03ff\u0400\3\2\2\2\u0400\u0407\5\u0128\u0095\2\u0401\u0403\7d\2\2"+
		"\u0402\u0404\7\u0160\2\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0407\5\u0128\u0095\2\u0406\u03eb\3\2\2\2\u0406\u03f0"+
		"\3\2\2\2\u0406\u03f6\3\2\2\2\u0406\u0401\3\2\2\2\u0407g\3\2\2\2\u0408"+
		"\u0436\7\'\2\2\u0409\u0436\7\30\2\2\u040a\u0436\7\31\2\2\u040b\u0436\7"+
		"\32\2\2\u040c\u0436\7\33\2\2\u040d\u0436\7\34\2\2\u040e\u0436\7E\2\2\u040f"+
		"\u0436\7F\2\2\u0410\u0436\7I\2\2\u0411\u0436\7J\2\2\u0412\u0414\7\\\2"+
		"\2\u0413\u0415\7\u00d9\2\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u0436\3\2\2\2\u0416\u0436\7t\2\2\u0417\u0436\7\u0092\2\2\u0418\u0436"+
		"\7\u0093\2\2\u0419\u0436\7\u0094\2\2\u041a\u0436\7\u0095\2\2\u041b\u0436"+
		"\7\u0096\2\2\u041c\u0436\7\u00bb\2\2\u041d\u0436\7\u00bd\2\2\u041e\u0436"+
		"\7\u00c7\2\2\u041f\u0436\7\u00c6\2\2\u0420\u0436\7\u00d8\2\2\u0421\u0436"+
		"\7\u00e4\2\2\u0422\u0423\7\u00eb\2\2\u0423\u0436\7\u0137\2\2\u0424\u0436"+
		"\7\u0109\2\2\u0425\u0436\7\u0108\2\2\u0426\u0436\7\u010a\2\2\u0427\u0436"+
		"\7\u010c\2\2\u0428\u0436\7\u010b\2\2\u0429\u0436\7\u0117\2\2\u042a\u0436"+
		"\7\u011c\2\2\u042b\u0436\7\u0123\2\2\u042c\u0436\7\u0124\2\2\u042d\u0436"+
		"\7\u0135\2\2\u042e\u0436\7\u0136\2\2\u042f\u0436\7\u0140\2\2\u0430\u0433"+
		"\5\u0150\u00a9\2\u0431\u0432\7\5\2\2\u0432\u0434\t\20\2\2\u0433\u0431"+
		"\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0436\3\2\2\2\u0435\u0408\3\2\2\2\u0435"+
		"\u0409\3\2\2\2\u0435\u040a\3\2\2\2\u0435\u040b\3\2\2\2\u0435\u040c\3\2"+
		"\2\2\u0435\u040d\3\2\2\2\u0435\u040e\3\2\2\2\u0435\u040f\3\2\2\2\u0435"+
		"\u0410\3\2\2\2\u0435\u0411\3\2\2\2\u0435\u0412\3\2\2\2\u0435\u0416\3\2"+
		"\2\2\u0435\u0417\3\2\2\2\u0435\u0418\3\2\2\2\u0435\u0419\3\2\2\2\u0435"+
		"\u041a\3\2\2\2\u0435\u041b\3\2\2\2\u0435\u041c\3\2\2\2\u0435\u041d\3\2"+
		"\2\2\u0435\u041e\3\2\2\2\u0435\u041f\3\2\2\2\u0435\u0420\3\2\2\2\u0435"+
		"\u0421\3\2\2\2\u0435\u0422\3\2\2\2\u0435\u0424\3\2\2\2\u0435\u0425\3\2"+
		"\2\2\u0435\u0426\3\2\2\2\u0435\u0427\3\2\2\2\u0435\u0428\3\2\2\2\u0435"+
		"\u0429\3\2\2\2\u0435\u042a\3\2\2\2\u0435\u042b\3\2\2\2\u0435\u042c\3\2"+
		"\2\2\u0435\u042d\3\2\2\2\u0435\u042e\3\2\2\2\u0435\u042f\3\2\2\2\u0435"+
		"\u0430\3\2\2\2\u0436i\3\2\2\2\u0437\u0438\7\u016a\2\2\u0438\u043a\t\21"+
		"\2\2\u0439\u043b\t\22\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u043e\3\2\2\2\u043c\u043d\7\u015c\2\2\u043d\u043f\7\u0175\2\2\u043e\u043c"+
		"\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\7\u016d\2"+
		"\2\u0441k\3\2\2\2\u0442\u0444\7\u00c3\2\2\u0443\u0442\3\2\2\2\u0443\u0444"+
		"\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u044e\7\u00c5\2\2\u0446\u0447\7(\2"+
		"\2\u0447\u0448\7\u0102\2\2\u0448\u044e\5\u0150\u00a9\2\u0449\u044b\7\u00c3"+
		"\2\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044e\t\23\2\2\u044d\u0443\3\2\2\2\u044d\u0446\3\2\2\2\u044d\u044a\3"+
		"\2\2\2\u044em\3\2\2\2\u044f\u0451\7\u015b\2\2\u0450\u044f\3\2\2\2\u0450"+
		"\u0451\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\7\u0160\2\2\u0453\u045c"+
		"\5\u0128\u0095\2\u0454\u0456\7\u013c\2\2\u0455\u0454\3\2\2\2\u0455\u0456"+
		"\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0459\7L\2\2\u0458\u045a\5\u0128\u0095"+
		"\2\u0459\u0458\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c\3\2\2\2\u045b\u0450"+
		"\3\2\2\2\u045b\u0455\3\2\2\2\u045co\3\2\2\2\u045d\u045e\7<\2\2\u045e\u0462"+
		"\t\24\2\2\u045f\u0460\7\u0088\2\2\u0460\u0461\7\u00c3\2\2\u0461\u0463"+
		"\7k\2\2\u0462\u045f\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u0468\5\u0128\u0095\2\u0465\u0467\5r:\2\u0466\u0465\3\2\2\2\u0467\u046a"+
		"\3\2\2\2\u0468\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469q\3\2\2\2\u046a"+
		"\u0468\3\2\2\2\u046b\u046c\7\61\2\2\u046c\u0470\5\u0128\u0095\2\u046d"+
		"\u046e\7\u00a9\2\2\u046e\u0470\5\u0128\u0095\2\u046f\u046b\3\2\2\2\u046f"+
		"\u046d\3\2\2\2\u0470s\3\2\2\2\u0471\u0472\5h\65\2\u0472\u0473\5\u0150"+
		"\u00a9\2\u0473\u0475\7\u016a\2\2\u0474\u0476\5v<\2\u0475\u0474\3\2\2\2"+
		"\u0475\u0476\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\7\u016d\2\2\u0478"+
		"\u047c\7\u0169\2\2\u0479\u047b\5x=\2\u047a\u0479\3\2\2\2\u047b\u047e\3"+
		"\2\2\2\u047c\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047f\3\2\2\2\u047e"+
		"\u047c\3\2\2\2\u047f\u0480\7\u016c\2\2\u0480u\3\2\2\2\u0481\u0482\5h\65"+
		"\2\u0482\u048c\5\u0150\u00a9\2\u0483\u0484\7\u015c\2\2\u0484\u0485\5h"+
		"\65\2\u0485\u0486\5\u0150\u00a9\2\u0486\u0488\3\2\2\2\u0487\u0483\3\2"+
		"\2\2\u0488\u048b\3\2\2\2\u0489\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a"+
		"\u048d\3\2\2\2\u048b\u0489\3\2\2\2\u048c\u0489\3\2\2\2\u048c\u048d\3\2"+
		"\2\2\u048dw\3\2\2\2\u048e\u0495\5\u008aF\2\u048f\u0495\5|?\2\u0490\u0495"+
		"\5\u0084C\2\u0491\u0495\5\u008cG\2\u0492\u0495\5\20\t\2\u0493\u0495\5"+
		"z>\2\u0494\u048e\3\2\2\2\u0494\u048f\3\2\2\2\u0494\u0490\3\2\2\2\u0494"+
		"\u0491\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0493\3\2\2\2\u0495y\3\2\2\2"+
		"\u0496\u049a\7\u0169\2\2\u0497\u0499\5x=\2\u0498\u0497\3\2\2\2\u0499\u049c"+
		"\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049d\3\2\2\2\u049c"+
		"\u049a\3\2\2\2\u049d\u049e\7\u016c\2\2\u049e{\3\2\2\2\u049f\u04a0\7\u0088"+
		"\2\2\u04a0\u04a1\7\u016a\2\2\u04a1\u04a2\5\u0118\u008d\2\u04a2\u04a3\7"+
		"\u016d\2\2\u04a3\u04a7\7\u0169\2\2\u04a4\u04a6\5x=\2\u04a5\u04a4\3\2\2"+
		"\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04aa"+
		"\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ac\7\u016c\2\2\u04ab\u04ad\5~@\2"+
		"\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad}\3\2\2\2\u04ae\u04b0\5"+
		"\u0080A\2\u04af\u04ae\3\2\2\2\u04b0\u04b3\3\2\2\2\u04b1\u04af\3\2\2\2"+
		"\u04b1\u04b2\3\2\2\2\u04b2\u04b5\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4\u04b1"+
		"\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b7\3\2\2\2\u04b6\u04b8\5\u0082B"+
		"\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\177\3\2\2\2\u04b9\u04ba"+
		"\7_\2\2\u04ba\u04bb\7\u0088\2\2\u04bb\u04bc\7\u016a\2\2\u04bc\u04bd\5"+
		"\u0118\u008d\2\u04bd\u04be\7\u016d\2\2\u04be\u04c2\7\u0169\2\2\u04bf\u04c1"+
		"\5x=\2\u04c0\u04bf\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2"+
		"\u04c3\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04c6\7\u016c"+
		"\2\2\u04c6\u0081\3\2\2\2\u04c7\u04c8\7_\2\2\u04c8\u04cc\7\u0169\2\2\u04c9"+
		"\u04cb\5x=\2\u04ca\u04c9\3\2\2\2\u04cb\u04ce\3\2\2\2\u04cc\u04ca\3\2\2"+
		"\2\u04cc\u04cd\3\2\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04cc\3\2\2\2\u04cf\u04d0"+
		"\7\u016c\2\2\u04d0\u0083\3\2\2\2\u04d1\u04d2\7u\2\2\u04d2\u04d3\7\u016a"+
		"\2\2\u04d3\u04d4\5\u0086D\2\u04d4\u04d5\7\u016f\2\2\u04d5\u04d6\5\u0086"+
		"D\2\u04d6\u04d7\7\u016f\2\2\u04d7\u04d8\5\u0086D\2\u04d8\u04d9\7\u016d"+
		"\2\2\u04d9\u04dd\7\u0169\2\2\u04da\u04dc\5x=\2\u04db\u04da\3\2\2\2\u04dc"+
		"\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e0\3\2"+
		"\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e1\7\u016c\2\2\u04e1\u0085\3\2\2\2\u04e2"+
		"\u04e3\5\u0088E\2\u04e3\u0087\3\2\2\2\u04e4\u04e7\5\u0118\u008d\2\u04e5"+
		"\u04e7\5\u008eH\2\u04e6\u04e4\3\2\2\2\u04e6\u04e5\3\2\2\2\u04e7\u04ef"+
		"\3\2\2\2\u04e8\u04eb\7\u015c\2\2\u04e9\u04ec\5\u0118\u008d\2\u04ea\u04ec"+
		"\5\u008eH\2\u04eb\u04e9\3\2\2\2\u04eb\u04ea\3\2\2\2\u04ec\u04ee\3\2\2"+
		"\2\u04ed\u04e8\3\2\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04f0"+
		"\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f2\u04e6\3\2\2\2\u04f2"+
		"\u04f3\3\2\2\2\u04f3\u0089\3\2\2\2\u04f4\u04f7\7\u00ec\2\2\u04f5\u04f8"+
		"\5\u0128\u0095\2\u04f6\u04f8\5\u00d8m\2\u04f7\u04f5\3\2\2\2\u04f7\u04f6"+
		"\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\7\u016f\2\2\u04fa\u008b\3\2\2"+
		"\2\u04fb\u04fc\5\u008eH\2\u04fc\u04fd\7\u016f\2\2\u04fd\u008d\3\2\2\2"+
		"\u04fe\u0502\5\u0090I\2\u04ff\u0502\5\u0094K\2\u0500\u0502\5\u0096L\2"+
		"\u0501\u04fe\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0500\3\2\2\2\u0502\u008f"+
		"\3\2\2\2\u0503\u0504\5h\65\2\u0504\u0506\5\u0150\u00a9\2\u0505\u0507\5"+
		"\u0092J\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u050f\3\2\2\2"+
		"\u0508\u0509\7\u015c\2\2\u0509\u050b\5\u0150\u00a9\2\u050a\u050c\5\u0092"+
		"J\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050e\3\2\2\2\u050d"+
		"\u0508\3\2\2\2\u050e\u0511\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2"+
		"\2\2\u0510\u0091\3\2\2\2\u0511\u050f\3\2\2\2\u0512\u0515\7\u0160\2\2\u0513"+
		"\u0516\5\u0128\u0095\2\u0514\u0516\5\u00d8m\2\u0515\u0513\3\2\2\2\u0515"+
		"\u0514\3\2\2\2\u0516\u0093\3\2\2\2\u0517\u0518\7\u0170\2\2\u0518\u051c"+
		"\7\u0170\2\2\u0519\u051a\7\u015a\2\2\u051a\u051c\7\u015a\2\2\u051b\u0517"+
		"\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
		"\u051e\5\u0150\u00a9\2\u051e\u0095\3\2\2\2\u051f\u0525\5\u0150\u00a9\2"+
		"\u0520\u0526\5\u0098M\2\u0521\u0522\7\u0170\2\2\u0522\u0526\7\u0170\2"+
		"\2\u0523\u0524\7\u015a\2\2\u0524\u0526\7\u015a\2\2\u0525\u0520\3\2\2\2"+
		"\u0525\u0521\3\2\2\2\u0525\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0097"+
		"\3\2\2\2\u0527\u0531\7\u0160\2\2\u0528\u0529\7\u015a\2\2\u0529\u0531\7"+
		"\u0160\2\2\u052a\u052b\7\u0170\2\2\u052b\u0531\7\u0160\2\2\u052c\u052d"+
		"\7\u015e\2\2\u052d\u0531\7\u0160\2\2\u052e\u052f\7\u0168\2\2\u052f\u0531"+
		"\7\u0160\2\2\u0530\u0527\3\2\2\2\u0530\u0528\3\2\2\2\u0530\u052a\3\2\2"+
		"\2\u0530\u052c\3\2\2\2\u0530\u052e\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0535"+
		"\5\u0128\u0095\2\u0533\u0535\5\u00d8m\2\u0534\u0532\3\2\2\2\u0534\u0533"+
		"\3\2\2\2\u0535\u0099\3\2\2\2\u0536\u0537\t\25\2\2\u0537\u0539\5h\65\2"+
		"\u0538\u053a\5j\66\2\u0539\u0538\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u009b"+
		"\3\2\2\2\u053b\u0543\7\13\2\2\u053c\u053f\7<\2\2\u053d\u053e\7\u00cd\2"+
		"\2\u053e\u0540\7\u00e7\2\2\u053f\u053d\3\2\2\2\u053f\u0540\3\2\2\2\u0540"+
		"\u0543\3\2\2\2\u0541\u0543\7\u00e7\2\2\u0542\u053b\3\2\2\2\u0542\u053c"+
		"\3\2\2\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544\3\2\2\2\u0544"+
		"\u0545\7\u00d4\2\2\u0545\u0546\5\u0150\u00a9\2\u0546\u0547\t\26\2\2\u0547"+
		"\u0548\5\u009eP\2\u0548\u054c\7c\2\2\u0549\u054a\5\u0150\u00a9\2\u054a"+
		"\u054b\7\u016f\2\2\u054b\u054d\3\2\2\2\u054c\u0549\3\2\2\2\u054c\u054d"+
		"\3\2\2\2\u054d\u009d\3\2\2\2\u054e\u054f\5\u00a0Q\2\u054f\u0555\7\u016f"+
		"\2\2\u0550\u0551\5\u00a0Q\2\u0551\u0552\7\u016f\2\2\u0552\u0554\3\2\2"+
		"\2\u0553\u0550\3\2\2\2\u0554\u0557\3\2\2\2\u0555\u0553\3\2\2\2\u0555\u0556"+
		"\3\2\2\2\u0556\u009f\3\2\2\2\u0557\u0555\3\2\2\2\u0558\u0566\5(\25\2\u0559"+
		"\u055a\7{\2\2\u055a\u055c\5\u0150\u00a9\2\u055b\u055d\5\u00aaV\2\u055c"+
		"\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\5\u009a"+
		"N\2\u055f\u0566\3\2\2\2\u0560\u0561\t\27\2\2\u0561\u0563\5\u0150\u00a9"+
		"\2\u0562\u0564\5\u00aaV\2\u0563\u0562\3\2\2\2\u0563\u0564\3\2\2\2\u0564"+
		"\u0566\3\2\2\2\u0565\u0558\3\2\2\2\u0565\u0559\3\2\2\2\u0565\u0560\3\2"+
		"\2\2\u0566\u00a1\3\2\2\2\u0567\u056f\7\13\2\2\u0568\u056b\7<\2\2\u0569"+
		"\u056a\7\u00cd\2\2\u056a\u056c\7\u00e7\2\2\u056b\u0569\3\2\2\2\u056b\u056c"+
		"\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056f\7\u00e7\2\2\u056e\u0567\3\2\2"+
		"\2\u056e\u0568\3\2\2\2\u056e\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570"+
		"\3\2\2\2\u0570\u0571\7\u00d4\2\2\u0571\u0572\7\35\2\2\u0572\u0573\5\u0150"+
		"\u00a9\2\u0573\u0574\t\26\2\2\u0574\u0575\5\u00a4S\2\u0575\u0579\7c\2"+
		"\2\u0576\u0577\5\u0150\u00a9\2\u0577\u0578\7\u016f\2\2\u0578\u057a\3\2"+
		"\2\2\u0579\u0576\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u00a3\3\2\2\2\u057b"+
		"\u057c\5\u00a6T\2\u057c\u0582\7\u016f\2\2\u057d\u057e\5\u00a6T\2\u057e"+
		"\u057f\7\u016f\2\2\u057f\u0581\3\2\2\2\u0580\u057d\3\2\2\2\u0581\u0584"+
		"\3\2\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u00a5\3\2\2\2\u0584"+
		"\u0582\3\2\2\2\u0585\u0589\5(\25\2\u0586\u0589\5t;\2\u0587\u0589\5\u00a8"+
		"U\2\u0588\u0585\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0587\3\2\2\2\u0589"+
		"\u00a7\3\2\2\2\u058a\u0592\7\13\2\2\u058b\u058e\7<\2\2\u058c\u058d\7\u00cd"+
		"\2\2\u058d\u058f\7\u00e7\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f"+
		"\u0592\3\2\2\2\u0590\u0592\7\u00e7\2\2\u0591\u058a\3\2\2\2\u0591\u058b"+
		"\3\2\2\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593"+
		"\u0594\t\27\2\2\u0594\u0596\5\u0150\u00a9\2\u0595\u0597\5\u00aaV\2\u0596"+
		"\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0599\3\2\2\2\u0598\u059a\5\u00ae"+
		"X\2\u0599\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059c\3\2\2\2\u059b"+
		"\u059d\t\26\2\2\u059c\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\3"+
		"\2\2\2\u059e\u05a0\5&\24\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0"+
		"\u05a2\3\2\2\2\u05a1\u05a3\5\u00d6l\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3"+
		"\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a8\5\f\7\2\u05a5\u05a6\5\u0150\u00a9"+
		"\2\u05a6\u05a7\7\u016f\2\2\u05a7\u05a9\3\2\2\2\u05a8\u05a5\3\2\2\2\u05a8"+
		"\u05a9\3\2\2\2\u05a9\u00a9\3\2\2\2\u05aa\u05ab\7\u016a\2\2\u05ab\u05c1"+
		"\7\u016d\2\2\u05ac\u05ad\7\u016a\2\2\u05ad\u05b2\5\u00acW\2\u05ae\u05af"+
		"\7\u015c\2\2\u05af\u05b1\5\u00acW\2\u05b0\u05ae\3\2\2\2\u05b1\u05b4\3"+
		"\2\2\2\u05b2\u05b0\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5\3\2\2\2\u05b4"+
		"\u05b2\3\2\2\2\u05b5\u05b6\7\u016d\2\2\u05b6\u05c1\3\2\2\2\u05b7\u05b8"+
		"\6V\4\2\u05b8\u05bd\5\u00acW\2\u05b9\u05ba\7\u015c\2\2\u05ba\u05bc\5\u00ac"+
		"W\2\u05bb\u05b9\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd"+
		"\u05be\3\2\2\2\u05be\u05c1\3\2\2\2\u05bf\u05bd\3\2\2\2\u05c0\u05aa\3\2"+
		"\2\2\u05c0\u05ac\3\2\2\2\u05c0\u05b7\3\2\2\2\u05c1\u00ab\3\2\2\2\u05c2"+
		"\u05c8\7\u008b\2\2\u05c3\u05c8\7\u00cf\2\2\u05c4\u05c8\7\u0090\2\2\u05c5"+
		"\u05c6\7\u008b\2\2\u05c6\u05c8\7\u00cf\2\2\u05c7\u05c2\3\2\2\2\u05c7\u05c3"+
		"\3\2\2\2\u05c7\u05c4\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8"+
		"\u05c9\3\2\2\2\u05c9\u05ca\5\u0150\u00a9\2\u05ca\u05cc\5h\65\2\u05cb\u05cd"+
		"\5j\66\2\u05cc\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05d1\3\2\2\2\u05ce"+
		"\u05d0\5l\67\2\u05cf\u05ce\3\2\2\2\u05d0\u05d3\3\2\2\2\u05d1\u05cf\3\2"+
		"\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d5\3\2\2\2\u05d3\u05d1\3\2\2\2\u05d4"+
		"\u05d6\5n8\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05ed\3\2\2"+
		"\2\u05d7\u05dd\5\u0150\u00a9\2\u05d8\u05de\7\u008b\2\2\u05d9\u05de\7\u00cf"+
		"\2\2\u05da\u05de\7\u0090\2\2\u05db\u05dc\7\u008b\2\2\u05dc\u05de\7\u00cf"+
		"\2\2\u05dd\u05d8\3\2\2\2\u05dd\u05d9\3\2\2\2\u05dd\u05da\3\2\2\2\u05dd"+
		"\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e1\5h"+
		"\65\2\u05e0\u05e2\5j\66\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u05e6\3\2\2\2\u05e3\u05e5\5l\67\2\u05e4\u05e3\3\2\2\2\u05e5\u05e8\3\2"+
		"\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05ea\3\2\2\2\u05e8"+
		"\u05e6\3\2\2\2\u05e9\u05eb\5n8\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2"+
		"\2\u05eb\u05ed\3\2\2\2\u05ec\u05c7\3\2\2\2\u05ec\u05d7\3\2\2\2\u05ed\u00ad"+
		"\3\2\2\2\u05ee\u05f0\5\u00b0Y\2\u05ef\u05ee\3\2\2\2\u05f0\u05f1\3\2\2"+
		"\2\u05f1\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u00af\3\2\2\2\u05f3\u05f4"+
		"\7\u00a2\2\2\u05f4\u05ff\7\u010d\2\2\u05f5\u05f6\7\u010d\2\2\u05f6\u05f7"+
		"\7\u00fe\2\2\u05f7\u05ff\t\30\2\2\u05f8\u05fa\7^\2\2\u05f9\u05f8\3\2\2"+
		"\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\7\u00ea\2\2\u05fc"+
		"\u05fd\7\u0105\2\2\u05fd\u05ff\7\u0175\2\2\u05fe\u05f3\3\2\2\2\u05fe\u05f5"+
		"\3\2\2\2\u05fe\u05f9\3\2\2\2\u05ff\u00b1\3\2\2\2\u0600\u0604\5\u00b4["+
		"\2\u0601\u0604\5\u00b6\\\2\u0602\u0604\5\u00b8]\2\u0603\u0600\3\2\2\2"+
		"\u0603\u0601\3\2\2\2\u0603\u0602\3\2\2\2\u0604\u00b3\3\2\2\2\u0605\u0606"+
		"\7\u0088\2\2\u0606\u0607\5\u0118\u008d\2\u0607\u0608\7\u0122\2\2\u0608"+
		"\u060c\5\4\3\2\u0609\u060b\5\u00ba^\2\u060a\u0609\3\2\2\2\u060b\u060e"+
		"\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u0610\3\2\2\2\u060e"+
		"\u060c\3\2\2\2\u060f\u0611\5\u00bc_\2\u0610\u060f\3\2\2\2\u0610\u0611"+
		"\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0613\7c\2\2\u0613\u0614\7\u0088\2"+
		"\2\u0614\u00b5\3\2\2\2\u0615\u0616\7\u0088\2\2\u0616\u0617\5\u0118\u008d"+
		"\2\u0617\u061a\5\b\5\2\u0618\u0619\7_\2\2\u0619\u061b\5\b\5\2\u061a\u0618"+
		"\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u00b7\3\2\2\2\u061c\u061d\7\6\2\2\u061d"+
		"\u061e\7\u0088\2\2\u061e\u061f\5\u0118\u008d\2\u061f\u0620\7\u0122\2\2"+
		"\u0620\u0621\5\b\5\2\u0621\u00b9\3\2\2\2\u0622\u0623\t\31\2\2\u0623\u0624"+
		"\5\u0118\u008d\2\u0624\u0625\7\u0122\2\2\u0625\u0626\5\4\3\2\u0626\u00bb"+
		"\3\2\2\2\u0627\u0628\7_\2\2\u0628\u0629\5\4\3\2\u0629\u00bd\3\2\2\2\u062a"+
		"\u062c\7\63\2\2\u062b\u062d\7\u013e\2\2\u062c\u062b\3\2\2\2\u062c\u062d"+
		"\3\2\2\2\u062d\u00bf\3\2\2\2\u062e\u0630\7<\2\2\u062f\u0631\7\u012d\2"+
		"\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0633"+
		"\7\u008d\2\2\u0633\u0634\5\u0150\u00a9\2\u0634\u0635\7\u00ca\2\2\u0635"+
		"\u0636\5\u0108\u0085\2\u0636\u0637\7\u016a\2\2\u0637\u063c\5\u00c2b\2"+
		"\u0638\u0639\7\u015c\2\2\u0639\u063b\5\u00c2b\2\u063a\u0638\3\2\2\2\u063b"+
		"\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u063f\3\2"+
		"\2\2\u063e\u063c\3\2\2\2\u063f\u0640\7\u016d\2\2\u0640\u00c1\3\2\2\2\u0641"+
		"\u0643\5\u0150\u00a9\2\u0642\u0644\t\b\2\2\u0643\u0642\3\2\2\2\u0643\u0644"+
		"\3\2\2\2\u0644\u00c3\3\2\2\2\u0645\u0646\5\u00c6d\2\u0646\u00c5\3\2\2"+
		"\2\u0647\u0648\7\u013c\2\2\u0648\u0649\7\u016a\2\2\u0649\u064a\5\u0150"+
		"\u00a9\2\u064a\u064b\7\u0160\2\2\u064b\u0653\5\u0150\u00a9\2\u064c\u064d"+
		"\7\u015c\2\2\u064d\u064e\5\u0150\u00a9\2\u064e\u064f\7\u0160\2\2\u064f"+
		"\u0650\5\u0150\u00a9\2\u0650\u0652\3\2\2\2\u0651\u064c\3\2\2\2\u0652\u0655"+
		"\3\2\2\2\u0653\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0656\3\2\2\2\u0655"+
		"\u0653\3\2\2\2\u0656\u065a\7\u016d\2\2\u0657\u0659\5d\63\2\u0658\u0657"+
		"\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b\3\2\2\2\u065b"+
		"\u00c7\3\2\2\2\u065c\u065a\3\2\2\2\u065d\u0661\5\u00caf\2\u065e\u0661"+
		"\5\u00ccg\2\u065f\u0661\5\u00ceh\2\u0660\u065d\3\2\2\2\u0660\u065e\3\2"+
		"\2\2\u0660\u065f\3\2\2\2\u0661\u00c9\3\2\2\2\u0662\u0664\7@\2\2\u0663"+
		"\u0662\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0668\7\u00fb"+
		"\2\2\u0666\u0668\7A\2\2\u0667\u0663\3\2\2\2\u0667\u0666\3\2\2\2\u0668"+
		"\u066a\3\2\2\2\u0669\u066b\7\u0160\2\2\u066a\u0669\3\2\2\2\u066a\u066b"+
		"\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066d\5\u0128\u0095\2\u066d\u00cb\3"+
		"\2\2\2\u066e\u066f\t\32\2\2\u066f\u0670\t\33\2\2\u0670\u00cd\3\2\2\2\u0671"+
		"\u0672\7\u00e0\2\2\u0672\u0675\7\u0160\2\2\u0673\u0676\5\u0128\u0095\2"+
		"\u0674\u0676\7\u00c2\2\2\u0675\u0673\3\2\2\2\u0675\u0674\3\2\2\2\u0676"+
		"\u0678\3\2\2\2\u0677\u0679\7\u012e\2\2\u0678\u0677\3\2\2\2\u0678\u0679"+
		"\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b\7u\2\2\u067b\u067c\t\34\2\2\u067c"+
		"\u00cf\3\2\2\2\u067d\u067e\7\u013b\2\2\u067e\u067f\5\u0118\u008d\2\u067f"+
		"\u0680\t\35\2\2\u0680\u0681\5\4\3\2\u0681\u0683\7c\2\2\u0682\u0684\t\36"+
		"\2\2\u0683\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u00d1\3\2\2\2\u0685"+
		"\u0686\7u\2\2\u0686\u0687\7\u0172\2\2\u0687\u0689\7\u008b\2\2\u0688\u068a"+
		"\7\u016a\2\2\u0689\u0688\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068b\3\2\2"+
		"\2\u068b\u068d\5\u00d8m\2\u068c\u068e\7\u016d\2\2\u068d\u068c\3\2\2\2"+
		"\u068d\u068e\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0690\7\u00b0\2\2\u0690"+
		"\u0691\5\4\3\2\u0691\u0692\7c\2\2\u0692\u0693\7\u00b0\2\2\u0693\u00d3"+
		"\3\2\2\2\u0694\u0695\7u\2\2\u0695\u0696\7\u0172\2\2\u0696\u0698\7\u008b"+
		"\2\2\u0697\u0699\7\u00ee\2\2\u0698\u0697\3\2\2\2\u0698\u0699\3\2\2\2\u0699"+
		"\u069a\3\2\2\2\u069a\u069b\5\u0128\u0095\2\u069b\u069c\7\u015f\2\2\u069c"+
		"\u069f\5\u0128\u0095\2\u069d\u069e\t\37\2\2\u069e\u06a0\5\u0128\u0095"+
		"\2\u069f\u069d\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2"+
		"\7\u00b0\2\2\u06a2\u06a3\5\4\3\2\u06a3\u06a4\7c\2\2\u06a4\u06a5\7\u00b0"+
		"\2\2\u06a5\u00d5\3\2\2\2\u06a6\u06ad\7\u017b\2\2\u06a7\u06a8\7\u0166\2"+
		"\2\u06a8\u06a9\7\u0166\2\2\u06a9\u06aa\7\u0172\2\2\u06aa\u06ab\7\u0164"+
		"\2\2\u06ab\u06ad\7\u0164\2\2\u06ac\u06a6\3\2\2\2\u06ac\u06a7\3\2\2\2\u06ad"+
		"\u00d7\3\2\2\2\u06ae\u06b0\5\u00dan\2\u06af\u06ae\3\2\2\2\u06af\u06b0"+
		"\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2\5\u00e0q\2\u06b2\u00d9\3\2\2"+
		"\2\u06b3\u06b4\7\u013c\2\2\u06b4\u06b9\5\u00dco\2\u06b5\u06b6\7\u015c"+
		"\2\2\u06b6\u06b8\5\u00dco\2\u06b7\u06b5\3\2\2\2\u06b8\u06bb\3\2\2\2\u06b9"+
		"\u06b7\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u00db\3\2\2\2\u06bb\u06b9\3\2"+
		"\2\2\u06bc\u06be\5\u0150\u00a9\2\u06bd\u06bf\5\u00dep\2\u06be\u06bd\3"+
		"\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c1\7\17\2\2\u06c1"+
		"\u06c2\7\u016a\2\2\u06c2\u06c3\5\u00e0q\2\u06c3\u06c4\7\u016d\2\2\u06c4"+
		"\u00dd\3\2\2\2\u06c5\u06c6\7\u016a\2\2\u06c6\u06cb\5\u0150\u00a9\2\u06c7"+
		"\u06c8\7\u015c\2\2\u06c8\u06ca\5\u0150\u00a9\2\u06c9\u06c7\3\2\2\2\u06ca"+
		"\u06cd\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06ce\3\2"+
		"\2\2\u06cd\u06cb\3\2\2\2\u06ce\u06cf\7\u016d\2\2\u06cf\u00df\3\2\2\2\u06d0"+
		"\u06d6\5\u00e2r\2\u06d1\u06d2\5\u00e4s\2\u06d2\u06d3\5\u00e2r\2\u06d3"+
		"\u06d5\3\2\2\2\u06d4\u06d1\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d4\3\2"+
		"\2\2\u06d6\u06d7\3\2\2\2\u06d7\u00e1\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d9"+
		"\u06df\5\u00e6t\2\u06da\u06db\7\u016a\2\2\u06db\u06dc\5\u00e0q\2\u06dc"+
		"\u06dd\7\u016d\2\2\u06dd\u06df\3\2\2\2\u06de\u06d9\3\2\2\2\u06de\u06da"+
		"\3\2\2\2\u06df\u00e3\3\2\2\2\u06e0\u06e2\7\u012c\2\2\u06e1\u06e3\7\t\2"+
		"\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06ed\3\2\2\2\u06e4\u06e6"+
		"\7f\2\2\u06e5\u06e7\7\t\2\2\u06e6\u06e5\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7"+
		"\u06ed\3\2\2\2\u06e8\u06ea\7\u0097\2\2\u06e9\u06eb\7\t\2\2\u06ea\u06e9"+
		"\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ed\3\2\2\2\u06ec\u06e0\3\2\2\2\u06ec"+
		"\u06e4\3\2\2\2\u06ec\u06e8\3\2\2\2\u06ed\u00e5\3\2\2\2\u06ee\u06ef\t "+
		"\2\2\u06ef\u06f1\5\u00e8u\2\u06f0\u06f2\5\u00f4{\2\u06f1\u06f0\3\2\2\2"+
		"\u06f1\u06f2\3\2\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06f5\5\u00f6|\2\u06f4"+
		"\u06f3\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f7\3\2\2\2\u06f6\u06f8\5\u010a"+
		"\u0086\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fa\3\2\2\2\u06f9"+
		"\u06fb\5\u010c\u0087\2\u06fa\u06f9\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fe"+
		"\3\2\2\2\u06fc\u06ff\5\u010e\u0088\2\u06fd\u06ff\5\u0110\u0089\2\u06fe"+
		"\u06fc\3\2\2\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0701\3\2"+
		"\2\2\u0700\u0702\5\u0112\u008a\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2\2"+
		"\2\u0702\u0704\3\2\2\2\u0703\u0705\5\u0114\u008b\2\u0704\u0703\3\2\2\2"+
		"\u0704\u0705\3\2\2\2\u0705\u00e7\3\2\2\2\u0706\u0708\5\u00eav\2\u0707"+
		"\u0706\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u070a\3\2\2\2\u0709\u070b\5\u00ec"+
		"w\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c\3\2\2\2\u070c"+
		"\u0711\5\u00eex\2\u070d\u070e\7\u015c\2\2\u070e\u0710\5\u00eex\2\u070f"+
		"\u070d\3\2\2\2\u0710\u0713\3\2\2\2\u0711\u070f\3\2\2\2\u0711\u0712\3\2"+
		"\2\2\u0712\u00e9\3\2\2\2\u0713\u0711\3\2\2\2\u0714\u0715\t!\2\2\u0715"+
		"\u00eb\3\2\2\2\u0716\u0717\7\u0127\2\2\u0717\u0718\5\u0128\u0095\2\u0718"+
		"\u00ed\3\2\2\2\u0719\u071a\5\u0150\u00a9\2\u071a\u071b\7\u0160\2\2\u071b"+
		"\u071d\3\2\2\2\u071c\u0719\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u071e\3\2"+
		"\2\2\u071e\u0720\5\u0128\u0095\2\u071f\u0721\5\u00f0y\2\u0720\u071f\3"+
		"\2\2\2\u0720\u0721\3\2\2\2\u0721\u0724\3\2\2\2\u0722\u0724\5\u00f2z\2"+
		"\u0723\u071c\3\2\2\2\u0723\u0722\3\2\2\2\u0724\u00ef\3\2\2\2\u0725\u0727"+
		"\6y\5\2\u0726\u0728\7\17\2\2\u0727\u0726\3\2\2\2\u0727\u0728\3\2\2\2\u0728"+
		"\u0729\3\2\2\2\u0729\u072f\5\u0150\u00a9\2\u072a\u072b\7\u016a\2\2\u072b"+
		"\u072c\7\u0125\2\2\u072c\u072d\7\u0173\2\2\u072d\u072f\7\u016d\2\2\u072e"+
		"\u0725\3\2\2\2\u072e\u072a\3\2\2\2\u072f\u00f1\3\2\2\2\u0730\u0731\7\u0172"+
		"\2\2\u0731\u0733\7\6\2\2\u0732\u0730\3\2\2\2\u0732\u0733\3\2\2\2\u0733"+
		"\u0734\3\2\2\2\u0734\u0735\7\u0168\2\2\u0735\u00f3\3\2\2\2\u0736\u0737"+
		"\7\u0099\2\2\u0737\u073c\5\u0150\u00a9\2\u0738\u0739\7\u015c\2\2\u0739"+
		"\u073b\5\u0150\u00a9\2\u073a\u0738\3\2\2\2\u073b\u073e\3\2\2\2\u073c\u073a"+
		"\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u00f5\3\2\2\2\u073e\u073c\3\2\2\2\u073f"+
		"\u0740\7y\2\2\u0740\u0744\5\u00f8}\2\u0741\u0743\5\u00fe\u0080\2\u0742"+
		"\u0741\3\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2"+
		"\2\2\u0745\u00f7\3\2\2\2\u0746\u0744\3\2\2\2\u0747\u074b\5\u00fa~\2\u0748"+
		"\u074b\5\u00fc\177\2\u0749\u074b\5\u0102\u0082\2\u074a\u0747\3\2\2\2\u074a"+
		"\u0748\3\2\2\2\u074a\u0749\3\2\2\2\u074b\u00f9\3\2\2\2\u074c\u074e\5\u0108"+
		"\u0085\2\u074d\u074f\5\u0106\u0084\2\u074e\u074d\3\2\2\2\u074e\u074f\3"+
		"\2\2\2\u074f\u00fb\3\2\2\2\u0750\u0751\7\u016a\2\2\u0751\u0752\5\u00d8"+
		"m\2\u0752\u0754\7\u016d\2\2\u0753\u0755\5\u0106\u0084\2\u0754\u0753\3"+
		"\2\2\2\u0754\u0755\3\2\2\2\u0755\u00fd\3\2\2\2\u0756\u0757\7\u015c\2\2"+
		"\u0757\u075e\5\u00f8}\2\u0758\u0759\5\u0100\u0081\2\u0759\u075a\5\u00f8"+
		"}\2\u075a\u075b\7\u00ca\2\2\u075b\u075c\5\u0118\u008d\2\u075c\u075e\3"+
		"\2\2\2\u075d\u0756\3\2\2\2\u075d\u0758\3\2\2\2\u075e\u00ff\3\2\2\2\u075f"+
		"\u0761\7\u008f\2\2\u0760\u075f\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0762"+
		"\3\2\2\2\u0762\u0769\7\u009e\2\2\u0763\u0765\t\"\2\2\u0764\u0766\7\u00d0"+
		"\2\2\u0765\u0764\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\3\2\2\2\u0767"+
		"\u0769\7\u009e\2\2\u0768\u0760\3\2\2\2\u0768\u0763\3\2\2\2\u0769\u0101"+
		"\3\2\2\2\u076a\u076b\7\u011d\2\2\u076b\u076c\7\u016a\2\2\u076c\u076d\7"+
		"\u0133\2\2\u076d\u0772\5\u0104\u0083\2\u076e\u076f\7\u015c\2\2\u076f\u0771"+
		"\5\u0104\u0083\2\u0770\u076e\3\2\2\2\u0771\u0774\3\2\2\2\u0772\u0770\3"+
		"\2\2\2\u0772\u0773\3\2\2\2\u0773\u0775\3\2\2\2\u0774\u0772\3\2\2\2\u0775"+
		"\u0777\7\u016d\2\2\u0776\u0778\5\u0106\u0084\2\u0777\u0776\3\2\2\2\u0777"+
		"\u0778\3\2\2\2\u0778\u0103\3\2\2\2\u0779\u0786\5\u0128\u0095\2\u077a\u077b"+
		"\7\u016a\2\2\u077b\u0780\5\u0128\u0095\2\u077c\u077d\7\u015c\2\2\u077d"+
		"\u077f\5\u0128\u0095\2\u077e\u077c\3\2\2\2\u077f\u0782\3\2\2\2\u0780\u077e"+
		"\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0783\3\2\2\2\u0782\u0780\3\2\2\2\u0783"+
		"\u0784\7\u016d\2\2\u0784\u0786\3\2\2\2\u0785\u0779\3\2\2\2\u0785\u077a"+
		"\3\2\2\2\u0786\u0105\3\2\2\2\u0787\u0789\6\u0084\6\2\u0788\u078a\7\17"+
		"\2\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b\3\2\2\2\u078b"+
		"\u0796\5\u0150\u00a9\2\u078c\u078d\7\u016a\2\2\u078d\u0792\7\u0172\2\2"+
		"\u078e\u078f\7\u015c\2\2\u078f\u0791\7\u0172\2\2\u0790\u078e\3\2\2\2\u0791"+
		"\u0794\3\2\2\2\u0792\u0790\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0795\3\2"+
		"\2\2\u0794\u0792\3\2\2\2\u0795\u0797\7\u016d\2\2\u0796\u078c\3\2\2\2\u0796"+
		"\u0797\3\2\2\2\u0797\u0107\3\2\2\2\u0798\u0799\5\u0150\u00a9\2\u0799\u0109"+
		"\3\2\2\2\u079a\u079b\7\u013a\2\2\u079b\u079c\5\u0118\u008d\2\u079c\u010b"+
		"\3\2\2\2\u079d\u079e\7\u0080\2\2\u079e\u079f\7\37\2\2\u079f\u07a4\5\u0128"+
		"\u0095\2\u07a0\u07a1\7\u015c\2\2\u07a1\u07a3\5\u0128\u0095\2\u07a2\u07a0"+
		"\3\2\2\2\u07a3\u07a6\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5"+
		"\u010d\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a7\u07a8\7\u0083\2\2\u07a8\u07a9"+
		"\5\u0118\u008d\2\u07a9\u010f\3\2\2\2\u07aa\u07ab\7\u00df\2\2\u07ab\u07ac"+
		"\5\u0118\u008d\2\u07ac\u0111\3\2\2\2\u07ad\u07ae\7\u00ce\2\2\u07ae\u07af"+
		"\7\37\2\2\u07af\u07b1\5\u0128\u0095\2\u07b0\u07b2\t\b\2\2\u07b1\u07b0"+
		"\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07ba\3\2\2\2\u07b3\u07b4\7\u015c\2"+
		"\2\u07b4\u07b6\5\u0128\u0095\2\u07b5\u07b7\t\b\2\2\u07b6\u07b5\3\2\2\2"+
		"\u07b6\u07b7\3\2\2\2\u07b7\u07b9\3\2\2\2\u07b8\u07b3\3\2\2\2\u07b9\u07bc"+
		"\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u0113\3\2\2\2\u07bc"+
		"\u07ba\3\2\2\2\u07bd\u07bf\5\u0116\u008c\2\u07be\u07bd\3\2\2\2\u07bf\u07c0"+
		"\3\2\2\2\u07c0\u07be\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u0115\3\2\2\2\u07c2"+
		"\u07c3\7\u00a6\2\2\u07c3\u07ce\5\u0128\u0095\2\u07c4\u07c5\7\u013c\2\2"+
		"\u07c5\u07cb\t#\2\2\u07c6\u07c7\7\u0130\2\2\u07c7\u07c8\7\f\2\2\u07c8"+
		"\u07c9\7\u009f\2\2\u07c9\u07ca\t$\2\2\u07ca\u07cc\7\u00ac\2\2\u07cb\u07c6"+
		"\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07ce\3\2\2\2\u07cd\u07c2\3\2\2\2\u07cd"+
		"\u07c4\3\2\2\2\u07ce\u0117\3\2\2\2\u07cf\u07d1\b\u008d\1\2\u07d0\u07d2"+
		"\7\u00c3\2\2\u07d1\u07d0\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\3\2\2"+
		"\2\u07d3\u07d4\7\u016a\2\2\u07d4\u07d5\5\u0118\u008d\2\u07d5\u07d6\7\u016d"+
		"\2\2\u07d6\u07e0\3\2\2\2\u07d7\u07e0\5\u011a\u008e\2\u07d8\u07da\7\u017c"+
		"\2\2\u07d9\u07d8\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07db\3\2\2\2\u07db"+
		"\u07dc\7\u016a\2\2\u07dc\u07dd\5\u0118\u008d\2\u07dd\u07de\7\u016d\2\2"+
		"\u07de\u07e0\3\2\2\2\u07df\u07cf\3\2\2\2\u07df\u07d7\3\2\2\2\u07df\u07d9"+
		"\3\2\2\2\u07e0\u07e7\3\2\2\2\u07e1\u07e2\f\5\2\2\u07e2\u07e3\5\u0124\u0093"+
		"\2\u07e3\u07e4\5\u0118\u008d\6\u07e4\u07e6\3\2\2\2\u07e5\u07e1\3\2\2\2"+
		"\u07e6\u07e9\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u0119"+
		"\3\2\2\2\u07e9\u07e7\3\2\2\2\u07ea\u07ee\5\u011c\u008f\2\u07eb\u07ee\5"+
		"\u0122\u0092\2\u07ec\u07ee\5\u0128\u0095\2\u07ed\u07ea\3\2\2\2\u07ed\u07eb"+
		"\3\2\2\2\u07ed\u07ec\3\2\2\2\u07ee\u011b\3\2\2\2\u07ef\u07f0\5\u0128\u0095"+
		"\2\u07f0\u07f2\7\u009b\2\2\u07f1\u07f3\7\u00c3\2\2\u07f2\u07f1\3\2\2\2"+
		"\u07f2\u07f3\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5\7\u00c5\2\2\u07f5"+
		"\u0807\3\2\2\2\u07f6\u07f7\5\u0128\u0095\2\u07f7\u07f8\7\27\2\2\u07f8"+
		"\u07f9\5\u0128\u0095\2\u07f9\u07fa\7\f\2\2\u07fa\u07fb\5\u0128\u0095\2"+
		"\u07fb\u0807\3\2\2\2\u07fc\u07fe\7\u00c3\2\2\u07fd\u07fc\3\2\2\2\u07fd"+
		"\u07fe\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\7k\2\2\u0800\u0801\7\u016a"+
		"\2\2\u0801\u0802\5\u00d8m\2\u0802\u0803\7\u016d\2\2\u0803\u0807\3\2\2"+
		"\2\u0804\u0807\5\u011e\u0090\2\u0805\u0807\5\u0120\u0091\2\u0806\u07ef"+
		"\3\2\2\2\u0806\u07f6\3\2\2\2\u0806\u07fd\3\2\2\2\u0806\u0804\3\2\2\2\u0806"+
		"\u0805\3\2\2\2\u0807\u011d\3\2\2\2\u0808\u080a\5\u0128\u0095\2\u0809\u080b"+
		"\7\u00c3\2\2\u080a\u0809\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u080c\3\2\2"+
		"\2\u080c\u080d\7\u008b\2\2\u080d\u0817\7\u016a\2\2\u080e\u0813\5\u0128"+
		"\u0095\2\u080f\u0810\7\u015c\2\2\u0810\u0812\5\u0128\u0095\2\u0811\u080f"+
		"\3\2\2\2\u0812\u0815\3\2\2\2\u0813\u0811\3\2\2\2\u0813\u0814\3\2\2\2\u0814"+
		"\u0818\3\2\2\2\u0815\u0813\3\2\2\2\u0816\u0818\5\u00d8m\2\u0817\u080e"+
		"\3\2\2\2\u0817\u0816\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u081a\7\u016d\2"+
		"\2\u081a\u011f\3\2\2\2\u081b\u081c\7\u016a\2\2\u081c\u0821\5\u0128\u0095"+
		"\2\u081d\u081e\7\u015c\2\2\u081e\u0820\5\u0128\u0095\2\u081f\u081d\3\2"+
		"\2\2\u0820\u0823\3\2\2\2\u0821\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822"+
		"\u0824\3\2\2\2\u0823\u0821\3\2\2\2\u0824\u0826\7\u016d\2\2\u0825\u0827"+
		"\7\u00c3\2\2\u0826\u0825\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0828\3\2\2"+
		"\2\u0828\u0829\7\u008b\2\2\u0829\u082a\7\u016a\2\2\u082a\u082b\5\u00d8"+
		"m\2\u082b\u082c\7\u016d\2\2\u082c\u0121\3\2\2\2\u082d\u082e\5\u0128\u0095"+
		"\2\u082e\u082f\5\u0126\u0094\2\u082f\u0830\5\u0128\u0095\2\u0830\u0123"+
		"\3\2\2\2\u0831\u0832\t%\2\2\u0832\u0125\3\2\2\2\u0833\u0840\7\u0160\2"+
		"\2\u0834\u0840\7\u0161\2\2\u0835\u0840\7\u0162\2\2\u0836\u0840\7\u0163"+
		"\2\2\u0837\u0840\7\u0166\2\2\u0838\u0840\7\u0167\2\2\u0839\u0840\7\u0164"+
		"\2\2\u083a\u0840\7\u0165\2\2\u083b\u083d\7\u00c3\2\2\u083c\u083b\3\2\2"+
		"\2\u083c\u083d\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u0840\t&\2\2\u083f\u0833"+
		"\3\2\2\2\u083f\u0834\3\2\2\2\u083f\u0835\3\2\2\2\u083f\u0836\3\2\2\2\u083f"+
		"\u0837\3\2\2\2\u083f\u0838\3\2\2\2\u083f\u0839\3\2\2\2\u083f\u083a\3\2"+
		"\2\2\u083f\u083c\3\2\2\2\u0840\u0127\3\2\2\2\u0841\u0842\b\u0095\1\2\u0842"+
		"\u0843\7\u016a\2\2\u0843\u0844\5\u00d8m\2\u0844\u0845\7\u016d\2\2\u0845"+
		"\u0853\3\2\2\2\u0846\u0847\7\u016a\2\2\u0847\u0848\5\u0128\u0095\2\u0848"+
		"\u0849\7\u016d\2\2\u0849\u0853\3\2\2\2\u084a\u0853\5\u012c\u0097\2\u084b"+
		"\u0853\5\u0130\u0099\2\u084c\u0853\5\u0134\u009b\2\u084d\u0853\5\u013a"+
		"\u009e\2\u084e\u0853\5\u013c\u009f\2\u084f\u0853\5\u0144\u00a3\2\u0850"+
		"\u0853\5\u0146\u00a4\2\u0851\u0853\5\u012a\u0096\2\u0852\u0841\3\2\2\2"+
		"\u0852\u0846\3\2\2\2\u0852\u084a\3\2\2\2\u0852\u084b\3\2\2\2\u0852\u084c"+
		"\3\2\2\2\u0852\u084d\3\2\2\2\u0852\u084e\3\2\2\2\u0852\u084f\3\2\2\2\u0852"+
		"\u0850\3\2\2\2\u0852\u0851\3\2\2\2\u0853\u0864\3\2\2\2\u0854\u0855\f\20"+
		"\2\2\u0855\u0856\7\u0168\2\2\u0856\u0863\5\u0128\u0095\21\u0857\u0858"+
		"\f\17\2\2\u0858\u0859\7\u015e\2\2\u0859\u0863\5\u0128\u0095\20\u085a\u085b"+
		"\f\16\2\2\u085b\u085c\7\u015a\2\2\u085c\u0863\5\u0128\u0095\17\u085d\u085e"+
		"\f\r\2\2\u085e\u085f\7\u0170\2\2\u085f\u0863\5\u0128\u0095\16\u0860\u0861"+
		"\f\21\2\2\u0861\u0863\5\u012e\u0098\2\u0862\u0854\3\2\2\2\u0862\u0857"+
		"\3\2\2\2\u0862\u085a\3\2\2\2\u0862\u085d\3\2\2\2\u0862\u0860\3\2\2\2\u0863"+
		"\u0866\3\2\2\2\u0864\u0862\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0129\3\2"+
		"\2\2\u0866\u0864\3\2\2\2\u0867\u0870\5\u014c\u00a7\2\u0868\u0870\5\u014e"+
		"\u00a8\2\u0869\u0870\5\u0158\u00ad\2\u086a\u0870\5\u0150\u00a9\2\u086b"+
		"\u0870\5\u0152\u00aa\2\u086c\u0870\5\u0156\u00ac\2\u086d\u0870\5\u0154"+
		"\u00ab\2\u086e\u0870\5\u015a\u00ae\2\u086f\u0867\3\2\2\2\u086f\u0868\3"+
		"\2\2\2\u086f\u0869\3\2\2\2\u086f\u086a\3\2\2\2\u086f\u086b\3\2\2\2\u086f"+
		"\u086c\3\2\2\2\u086f\u086d\3\2\2\2\u086f\u086e\3\2\2\2\u0870\u012b\3\2"+
		"\2\2\u0871\u0872\7\u0098\2\2\u0872\u0873\5\u0128\u0095\2\u0873\u0874\5"+
		"\u012e\u0098\2\u0874\u012d\3\2\2\2\u0875\u0876\t\'\2\2\u0876\u012f\3\2"+
		"\2\2\u0877\u0878\5\u0132\u009a\2\u0878\u0879\t(\2\2\u0879\u087e\5\u0132"+
		"\u009a\2\u087a\u087b\t(\2\2\u087b\u087d\5\u0132\u009a\2\u087c\u087a\3"+
		"\2\2\2\u087d\u0880\3\2\2\2\u087e\u087c\3\2\2\2\u087e\u087f\3\2\2\2\u087f"+
		"\u0131\3\2\2\2\u0880\u087e\3\2\2\2\u0881\u0882\7\u016a\2\2\u0882\u0883"+
		"\5\u0128\u0095\2\u0883\u0884\7\u016d\2\2\u0884\u088b\3\2\2\2\u0885\u088b"+
		"\5\u0134\u009b\2\u0886\u088b\5\u013c\u009f\2\u0887\u088b\5\u0144\u00a3"+
		"\2\u0888\u088b\5\u0146\u00a4\2\u0889\u088b\5\u012a\u0096\2\u088a\u0881"+
		"\3\2\2\2\u088a\u0885\3\2\2\2\u088a\u0886\3\2\2\2\u088a\u0887\3\2\2\2\u088a"+
		"\u0888\3\2\2\2\u088a\u0889\3\2\2\2\u088b\u0133\3\2\2\2\u088c\u088f\5\u0136"+
		"\u009c\2\u088d\u088f\5\u0138\u009d\2\u088e\u088c\3\2\2\2\u088e\u088d\3"+
		"\2\2\2\u088f\u0135\3\2\2\2\u0890\u0891\7$\2\2\u0891\u0897\5\u0128\u0095"+
		"\2\u0892\u0893\7\u0139\2\2\u0893\u0894\5\u0128\u0095\2\u0894\u0895\7\u0122"+
		"\2\2\u0895\u0896\5\u0128\u0095\2\u0896\u0898\3\2\2\2\u0897\u0892\3\2\2"+
		"\2\u0898\u0899\3\2\2\2\u0899\u0897\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089d"+
		"\3\2\2\2\u089b\u089c\7_\2\2\u089c\u089e\5\u0128\u0095\2\u089d\u089b\3"+
		"\2\2\2\u089d\u089e\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a0\7c\2\2\u08a0"+
		"\u0137\3\2\2\2\u08a1\u08a7\7$\2\2\u08a2\u08a3\7\u0139\2\2\u08a3\u08a4"+
		"\5\u0118\u008d\2\u08a4\u08a5\7\u0122\2\2\u08a5\u08a6\5\u0128\u0095\2\u08a6"+
		"\u08a8\3\2\2\2\u08a7\u08a2\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08a7\3\2"+
		"\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ad\3\2\2\2\u08ab\u08ac\7_\2\2\u08ac"+
		"\u08ae\5\u0128\u0095\2\u08ad\u08ab\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08af"+
		"\3\2\2\2\u08af\u08b0\7c\2\2\u08b0\u0139\3\2\2\2\u08b1\u08b2\5\u0150\u00a9"+
		"\2\u08b2\u08b3\7\5\2\2\u08b3\u08b4\t)\2\2\u08b4\u013b\3\2\2\2\u08b5\u08b6"+
		"\7\24\2\2\u08b6\u08b8\7\u016a\2\2\u08b7\u08b9\5\u013e\u00a0\2\u08b8\u08b7"+
		"\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08ba\3\2\2\2\u08ba\u08bb\5\u0128\u0095"+
		"\2\u08bb\u08bd\7\u016d\2\2\u08bc\u08be\5\u0140\u00a1\2\u08bd\u08bc\3\2"+
		"\2\2\u08bd\u08be\3\2\2\2\u08be\u094e\3\2\2\2\u08bf\u08c0\7:\2\2\u08c0"+
		"\u08c6\7\u016a\2\2\u08c1\u08c3\5\u013e\u00a0\2\u08c2\u08c1\3\2\2\2\u08c2"+
		"\u08c3\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c7\5\u0128\u0095\2\u08c5\u08c7"+
		"\7\u0168\2\2\u08c6\u08c2\3\2\2\2\u08c6\u08c5\3\2\2\2\u08c7\u08c8\3\2\2"+
		"\2\u08c8\u08ca\7\u016d\2\2\u08c9\u08cb\5\u0140\u00a1\2\u08ca\u08c9\3\2"+
		"\2\2\u08ca\u08cb\3\2\2\2\u08cb\u094e\3\2\2\2\u08cc\u08cd\7;\2\2\u08cd"+
		"\u08d3\7\u016a\2\2\u08ce\u08d0\5\u013e\u00a0\2\u08cf\u08ce\3\2\2\2\u08cf"+
		"\u08d0\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d4\5\u0128\u0095\2\u08d2\u08d4"+
		"\7\u0168\2\2\u08d3\u08cf\3\2\2\2\u08d3\u08d2\3\2\2\2\u08d4\u08d5\3\2\2"+
		"\2\u08d5\u08d7\7\u016d\2\2\u08d6\u08d8\5\u0140\u00a1\2\u08d7\u08d6\3\2"+
		"\2\2\u08d7\u08d8\3\2\2\2\u08d8\u094e\3\2\2\2\u08d9\u08da\7\u0143\2\2\u08da"+
		"\u08db\7\u016a\2\2\u08db\u08dc\7\u016d\2\2\u08dc\u094e\5\u0140\u00a1\2"+
		"\u08dd\u08de\7\u0147\2\2\u08de\u08df\7\u016a\2\2\u08df\u08e0\7\u016d\2"+
		"\2\u08e0\u094e\5\u0140\u00a1\2\u08e1\u08e2\7\u0148\2\2\u08e2\u08e3\7\u016a"+
		"\2\2\u08e3\u08e4\5\u0128\u0095\2\u08e4\u08e5\7\u016d\2\2\u08e5\u08e6\5"+
		"\u0140\u00a1\2\u08e6\u094e\3\2\2\2\u08e7\u08e8\7\u0149\2\2\u08e8\u08e9"+
		"\7\u016a\2\2\u08e9\u08f0\5\u0128\u0095\2\u08ea\u08eb\7\u015c\2\2\u08eb"+
		"\u08ee\5\u0128\u0095\2\u08ec\u08ed\7\u015c\2\2\u08ed\u08ef\5\u0128\u0095"+
		"\2\u08ee\u08ec\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef\u08f1\3\2\2\2\u08f0\u08ea"+
		"\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u08f3\7\u016d\2"+
		"\2\u08f3\u08f4\5\u0140\u00a1\2\u08f4\u094e\3\2\2\2\u08f5\u08f6\7\u014a"+
		"\2\2\u08f6\u08f7\7\u016a\2\2\u08f7\u08f8\5\u0128\u0095\2\u08f8\u08f9\7"+
		"\u016d\2\2\u08f9\u08fa\5\u0140\u00a1\2\u08fa\u094e\3\2\2\2\u08fb\u08fc"+
		"\7\u014b\2\2\u08fc\u08fd\7\u016a\2\2\u08fd\u0904\5\u0128\u0095\2\u08fe"+
		"\u08ff\7\u015c\2\2\u08ff\u0902\5\u0128\u0095\2\u0900\u0901\7\u015c\2\2"+
		"\u0901\u0903\5\u0128\u0095\2\u0902\u0900\3\2\2\2\u0902\u0903\3\2\2\2\u0903"+
		"\u0905\3\2\2\2\u0904\u08fe\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u0906\3\2"+
		"\2\2\u0906\u0907\7\u016d\2\2\u0907\u0908\5\u0140\u00a1\2\u0908\u094e\3"+
		"\2\2\2\u0909\u090a\7\u00b3\2\2\u090a\u090c\7\u016a\2\2\u090b\u090d\5\u013e"+
		"\u00a0\2\u090c\u090b\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\3\2\2\2\u090e"+
		"\u090f\5\u0128\u0095\2\u090f\u0911\7\u016d\2\2\u0910\u0912\5\u0140\u00a1"+
		"\2\u0911\u0910\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u094e\3\2\2\2\u0913\u0914"+
		"\7\u00b9\2\2\u0914\u0916\7\u016a\2\2\u0915\u0917\5\u013e\u00a0\2\u0916"+
		"\u0915\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u0919\5\u0128"+
		"\u0095";
	private static final String _serializedATNSegment1 =
		"\2\u0919\u091b\7\u016d\2\2\u091a\u091c\5\u0140\u00a1\2\u091b\u091a\3\2"+
		"\2\2\u091b\u091c\3\2\2\2\u091c\u094e\3\2\2\2\u091d\u091e\7\u0154\2\2\u091e"+
		"\u091f\7\u016a\2\2\u091f\u0920\7\u016d\2\2\u0920\u094e\5\u0140\u00a1\2"+
		"\u0921\u0922\7\u0155\2\2\u0922\u0923\7\u016a\2\2\u0923\u0924\7\u016d\2"+
		"\2\u0924\u094e\5\u0140\u00a1\2\u0925\u0926\7\u0156\2\2\u0926\u0928\7\u016a"+
		"\2\2\u0927\u0929\5\u013e\u00a0\2\u0928\u0927\3\2\2\2\u0928\u0929\3\2\2"+
		"\2\u0929\u092a\3\2\2\2\u092a\u092b\5\u0128\u0095\2\u092b\u092d\7\u016d"+
		"\2\2\u092c\u092e\5\u0140\u00a1\2\u092d\u092c\3\2\2\2\u092d\u092e\3\2\2"+
		"\2\u092e\u094e\3\2\2\2\u092f\u0930\7\u011a\2\2\u0930\u0932\7\u016a\2\2"+
		"\u0931\u0933\5\u013e\u00a0\2\u0932\u0931\3\2\2\2\u0932\u0933\3\2\2\2\u0933"+
		"\u0934\3\2\2\2\u0934\u0935\5\u0128\u0095\2\u0935\u0937\7\u016d\2\2\u0936"+
		"\u0938\5\u0140\u00a1\2\u0937\u0936\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u094e"+
		"\3\2\2\2\u0939\u093a\7\u0134\2\2\u093a\u093c\7\u016a\2\2\u093b\u093d\5"+
		"\u013e\u00a0\2\u093c\u093b\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u093e\3\2"+
		"\2\2\u093e\u093f\5\u0128\u0095\2\u093f\u0941\7\u016d\2\2\u0940\u0942\5"+
		"\u0140\u00a1\2\u0941\u0940\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u094e\3\2"+
		"\2\2\u0943\u0944\7\u0158\2\2\u0944\u0946\7\u016a\2\2\u0945\u0947\5\u013e"+
		"\u00a0\2\u0946\u0945\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u0948\3\2\2\2\u0948"+
		"\u0949\5\u0128\u0095\2\u0949\u094b\7\u016d\2\2\u094a\u094c\5\u0140\u00a1"+
		"\2\u094b\u094a\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094e\3\2\2\2\u094d\u08b5"+
		"\3\2\2\2\u094d\u08bf\3\2\2\2\u094d\u08cc\3\2\2\2\u094d\u08d9\3\2\2\2\u094d"+
		"\u08dd\3\2\2\2\u094d\u08e1\3\2\2\2\u094d\u08e7\3\2\2\2\u094d\u08f5\3\2"+
		"\2\2\u094d\u08fb\3\2\2\2\u094d\u0909\3\2\2\2\u094d\u0913\3\2\2\2\u094d"+
		"\u091d\3\2\2\2\u094d\u0921\3\2\2\2\u094d\u0925\3\2\2\2\u094d\u092f\3\2"+
		"\2\2\u094d\u0939\3\2\2\2\u094d\u0943\3\2\2\2\u094e\u013d\3\2\2\2\u094f"+
		"\u0950\t!\2\2\u0950\u013f\3\2\2\2\u0951\u0952\7\u00d1\2\2\u0952\u0954"+
		"\7\u016a\2\2\u0953\u0955\5\u0142\u00a2\2\u0954\u0953\3\2\2\2\u0954\u0955"+
		"\3\2\2\2\u0955\u0957\3\2\2\2\u0956\u0958\5\u0112\u008a\2\u0957\u0956\3"+
		"\2\2\2\u0957\u0958\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u095a\7\u016d\2\2"+
		"\u095a\u0141\3\2\2\2\u095b\u095c\7\u00d5\2\2\u095c\u095d\7\37\2\2\u095d"+
		"\u0962\5\u0128\u0095\2\u095e\u095f\7\u015c\2\2\u095f\u0961\5\u0128\u0095"+
		"\2\u0960\u095e\3\2\2\2\u0961\u0964\3\2\2\2\u0962\u0960\3\2\2\2\u0962\u0963"+
		"\3\2\2\2\u0963\u0143\3\2\2\2\u0964\u0962\3\2\2\2\u0965\u0a2e\7\u0142\2"+
		"\2\u0966\u0967\7&\2\2\u0967\u0968\7\u016a\2\2\u0968\u0969\5\u0128\u0095"+
		"\2\u0969\u096a\7\17\2\2\u096a\u096c\5h\65\2\u096b\u096d\5j\66\2\u096c"+
		"\u096b\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u096f\7\u016d"+
		"\2\2\u096f\u0a2e\3\2\2\2\u0970\u0971\7:\2\2\u0971\u0974\7\u016a\2\2\u0972"+
		"\u0975\5\u0128\u0095\2\u0973\u0975\7\u0168\2\2\u0974\u0972\3\2\2\2\u0974"+
		"\u0973\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0a2e\7\u016d\2\2\u0977\u0a2e"+
		"\7\u0144\2\2\u0978\u0979\7@\2\2\u0979\u0a2e\7E\2\2\u097a\u097e\7\u0145"+
		"\2\2\u097b\u097c\7@\2\2\u097c\u097e\7\u0123\2\2\u097d\u097a\3\2\2\2\u097d"+
		"\u097b\3\2\2\2\u097e\u0983\3\2\2\2\u097f\u0980\7\u016a\2\2\u0980\u0981"+
		"\5\u0128\u0095\2\u0981\u0982\7\u016d\2\2\u0982\u0984\3\2\2\2\u0983\u097f"+
		"\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0a2e\3\2\2\2\u0985\u0a2e\7\u0146\2"+
		"\2\u0986\u0987\7@\2\2\u0987\u0a2e\7\u0159\2\2\u0988\u0989\7\u014c\2\2"+
		"\u0989\u098a\7\u016a\2\2\u098a\u0997\5\u0128\u0095\2\u098b\u098c\7\u015c"+
		"\2\2\u098c\u0994\5\u0128\u0095\2\u098d\u098e\7\u015c\2\2\u098e\u098f\5"+
		"\u0128\u0095\2\u098f\u0990\7\u0160\2\2\u0990\u0991\5\u0128\u0095\2\u0991"+
		"\u0993\3\2\2\2\u0992\u098d\3\2\2\2\u0993\u0996\3\2\2\2\u0994\u0992\3\2"+
		"\2\2\u0994\u0995\3\2\2\2\u0995\u0998\3\2\2\2\u0996\u0994\3\2\2\2\u0997"+
		"\u098b\3\2\2\2\u0997\u0998\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u099a\7\u016d"+
		"\2\2\u099a\u0a2e\3\2\2\2\u099b\u099c\7\u014d\2\2\u099c\u099d\7\u016a\2"+
		"\2\u099d\u09aa\5\u0128\u0095\2\u099e\u099f\7\u015c\2\2\u099f\u09a7\5\u0128"+
		"\u0095\2\u09a0\u09a1\7\u015c\2\2\u09a1\u09a2\5\u0128\u0095\2\u09a2\u09a3"+
		"\7\u0160\2\2\u09a3\u09a4\5\u0128\u0095\2\u09a4\u09a6\3\2\2\2\u09a5\u09a0"+
		"\3\2\2\2\u09a6\u09a9\3\2\2\2\u09a7\u09a5\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8"+
		"\u09ab\3\2\2\2\u09a9\u09a7\3\2\2\2\u09aa\u099e\3\2\2\2\u09aa\u09ab\3\2"+
		"\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\7\u016d\2\2\u09ad\u0a2e\3\2\2\2\u09ae"+
		"\u09af\7\u014e\2\2\u09af\u09b0\7\u016a\2\2\u09b0\u09bd\5\u0128\u0095\2"+
		"\u09b1\u09b2\7\u015c\2\2\u09b2\u09ba\5\u0128\u0095\2\u09b3\u09b4\7\u015c"+
		"\2\2\u09b4\u09b5\5\u0128\u0095\2\u09b5\u09b6\7\u0160\2\2\u09b6\u09b7\5"+
		"\u0128\u0095\2\u09b7\u09b9\3\2\2\2\u09b8\u09b3\3\2\2\2\u09b9\u09bc\3\2"+
		"\2\2\u09ba\u09b8\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09be\3\2\2\2\u09bc"+
		"\u09ba\3\2\2\2\u09bd\u09b1\3\2\2\2\u09bd\u09be\3\2\2\2\u09be\u09bf\3\2"+
		"\2\2\u09bf\u09c0\7\u016d\2\2\u09c0\u0a2e\3\2\2\2\u09c1\u09c2\7\u014f\2"+
		"\2\u09c2\u09c3\7\u016a\2\2\u09c3\u09d0\5\u0128\u0095\2\u09c4\u09c5\7\u015c"+
		"\2\2\u09c5\u09cd\5\u0128\u0095\2\u09c6\u09c7\7\u015c\2\2\u09c7\u09c8\5"+
		"\u0128\u0095\2\u09c8\u09c9\7\u0160\2\2\u09c9\u09ca\5\u0128\u0095\2\u09ca"+
		"\u09cc\3\2\2\2\u09cb\u09c6\3\2\2\2\u09cc\u09cf\3\2\2\2\u09cd\u09cb\3\2"+
		"\2\2\u09cd\u09ce\3\2\2\2\u09ce\u09d1\3\2\2\2\u09cf\u09cd\3\2\2\2\u09d0"+
		"\u09c4\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d3\7\u016d"+
		"\2\2\u09d3\u0a2e\3\2\2\2\u09d4\u09d5\7\u0150\2\2\u09d5\u09d6\7\u016a\2"+
		"\2\u09d6\u09e3\5\u0128\u0095\2\u09d7\u09d8\7\u015c\2\2\u09d8\u09e0\5\u0128"+
		"\u0095\2\u09d9\u09da\7\u015c\2\2\u09da\u09db\5\u0128\u0095\2\u09db\u09dc"+
		"\7\u0160\2\2\u09dc\u09dd\5\u0128\u0095\2\u09dd\u09df\3\2\2\2\u09de\u09d9"+
		"\3\2\2\2\u09df\u09e2\3\2\2\2\u09e0\u09de\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1"+
		"\u09e4\3\2\2\2\u09e2\u09e0\3\2\2\2\u09e3\u09d7\3\2\2\2\u09e3\u09e4\3\2"+
		"\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e6\7\u016d\2\2\u09e6\u0a2e\3\2\2\2\u09e7"+
		"\u09e8\7\u0151\2\2\u09e8\u09e9\7\u016a\2\2\u09e9\u09f6\5\u0128\u0095\2"+
		"\u09ea\u09eb\7\u015c\2\2\u09eb\u09f3\5\u0128\u0095\2\u09ec\u09ed\7\u015c"+
		"\2\2\u09ed\u09ee\5\u0128\u0095\2\u09ee\u09ef\7\u0160\2\2\u09ef\u09f0\5"+
		"\u0128\u0095\2\u09f0\u09f2\3\2\2\2\u09f1\u09ec\3\2\2\2\u09f2\u09f5\3\2"+
		"\2\2\u09f3\u09f1\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f7\3\2\2\2\u09f5"+
		"\u09f3\3\2\2\2\u09f6\u09ea\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7\u09f8\3\2"+
		"\2\2\u09f8\u09f9\7\u016d\2\2\u09f9\u0a2e\3\2\2\2\u09fa\u09fb\7\u0152\2"+
		"\2\u09fb\u09fc\7\u016a\2\2\u09fc\u0a04\5\u0128\u0095\2\u09fd\u09fe\7\u015c"+
		"\2\2\u09fe\u09ff\5\u0128\u0095\2\u09ff\u0a00\7\u0160\2\2\u0a00\u0a01\5"+
		"\u0128\u0095\2\u0a01\u0a03\3\2\2\2\u0a02\u09fd\3\2\2\2\u0a03\u0a06\3\2"+
		"\2\2\u0a04\u0a02\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a07\3\2\2\2\u0a06"+
		"\u0a04\3\2\2\2\u0a07\u0a08\7\u016d\2\2\u0a08\u0a2e\3\2\2\2\u0a09\u0a0a"+
		"\7\u0153\2\2\u0a0a\u0a0b\7\u016a\2\2\u0a0b\u0a11\5\u0128\u0095\2\u0a0c"+
		"\u0a0d\7\u015c\2\2\u0a0d\u0a0e\5\u0128\u0095\2\u0a0e\u0a0f\7\u0160\2\2"+
		"\u0a0f\u0a10\5\u0128\u0095\2\u0a10\u0a12\3\2\2\2\u0a11\u0a0c\3\2\2\2\u0a12"+
		"\u0a13\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14\u0a17\3\2"+
		"\2\2\u0a15\u0a16\7\u015c\2\2\u0a16\u0a18\5\u0128\u0095\2\u0a17\u0a15\3"+
		"\2\2\2\u0a17\u0a18\3\2\2\2\u0a18\u0a19\3\2\2\2\u0a19\u0a1a\7\u016d\2\2"+
		"\u0a1a\u0a2e\3\2\2\2\u0a1b\u0a1c\7\u00fa\2\2\u0a1c\u0a1d\7\u016a\2\2\u0a1d"+
		"\u0a1e\5\u0128\u0095\2\u0a1e\u0a1f\7\u016d\2\2\u0a1f\u0a2e\3\2\2\2\u0a20"+
		"\u0a21\7\u0119\2\2\u0a21\u0a22\7\u016a\2\2\u0a22\u0a23\5\u0128\u0095\2"+
		"\u0a23\u0a24\7y\2\2\u0a24\u0a27\5\u0128\u0095\2\u0a25\u0a26\7u\2\2\u0a26"+
		"\u0a28\5\u0128\u0095\2\u0a27\u0a25\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u0a29"+
		"\3\2\2\2\u0a29\u0a2a\7\u016d\2\2\u0a2a\u0a2e\3\2\2\2\u0a2b\u0a2e\7\u0157"+
		"\2\2\u0a2c\u0a2e\7\u0159\2\2\u0a2d\u0965\3\2\2\2\u0a2d\u0966\3\2\2\2\u0a2d"+
		"\u0970\3\2\2\2\u0a2d\u0977\3\2\2\2\u0a2d\u0978\3\2\2\2\u0a2d\u097d\3\2"+
		"\2\2\u0a2d\u0985\3\2\2\2\u0a2d\u0986\3\2\2\2\u0a2d\u0988\3\2\2\2\u0a2d"+
		"\u099b\3\2\2\2\u0a2d\u09ae\3\2\2\2\u0a2d\u09c1\3\2\2\2\u0a2d\u09d4\3\2"+
		"\2\2\u0a2d\u09e7\3\2\2\2\u0a2d\u09fa\3\2\2\2\u0a2d\u0a09\3\2\2\2\u0a2d"+
		"\u0a1b\3\2\2\2\u0a2d\u0a20\3\2\2\2\u0a2d\u0a2b\3\2\2\2\u0a2d\u0a2c\3\2"+
		"\2\2\u0a2e\u0145\3\2\2\2\u0a2f\u0a30\5\u0150\u00a9\2\u0a30\u0a32\7\u016a"+
		"\2\2\u0a31\u0a33\5\u0148\u00a5\2\u0a32\u0a31\3\2\2\2\u0a32\u0a33\3\2\2"+
		"\2\u0a33\u0a34\3\2\2\2\u0a34\u0a35\7\u016d\2\2\u0a35\u0147\3\2\2\2\u0a36"+
		"\u0a3b\5\u014a\u00a6\2\u0a37\u0a38\7\u015c\2\2\u0a38\u0a3a\5\u014a\u00a6"+
		"\2\u0a39\u0a37\3\2\2\2\u0a3a\u0a3d\3\2\2\2\u0a3b\u0a39\3\2\2\2\u0a3b\u0a3c"+
		"\3\2\2\2\u0a3c\u0149\3\2\2\2\u0a3d\u0a3b\3\2\2\2\u0a3e\u0a44\6\u00a6\r"+
		"\2\u0a3f\u0a40\5\u0150\u00a9\2\u0a40\u0a42\7\u0160\2\2\u0a41\u0a43\7\u0164"+
		"\2\2\u0a42\u0a41\3\2\2\2\u0a42\u0a43\3\2\2\2\u0a43\u0a45\3\2\2\2\u0a44"+
		"\u0a3f\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a47\5\u0128"+
		"\u0095\2\u0a47\u014b\3\2\2\2\u0a48\u0a49\7E\2\2\u0a49\u0a4a\5\u0152\u00aa"+
		"\2\u0a4a\u014d\3\2\2\2\u0a4b\u0a4c\7\u0123\2\2\u0a4c\u0a4d\5\u0152\u00aa"+
		"\2\u0a4d\u014f\3\2\2\2\u0a4e\u0a51\7\u0172\2\2\u0a4f\u0a51\5\u015c\u00af"+
		"\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a4f\3\2\2\2\u0a51\u0a59\3\2\2\2\u0a52\u0a55"+
		"\7\6\2\2\u0a53\u0a56\7\u0172\2\2\u0a54\u0a56\5\u015c\u00af\2\u0a55\u0a53"+
		"\3\2\2\2\u0a55\u0a54\3\2\2\2\u0a56\u0a58\3\2\2\2\u0a57\u0a52\3\2\2\2\u0a58"+
		"\u0a5b\3\2\2\2\u0a59\u0a57\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0151\3\2"+
		"\2\2\u0a5b\u0a59\3\2\2\2\u0a5c\u0a5f\7\u0173\2\2\u0a5d\u0a5f\7\u0174\2"+
		"\2\u0a5e\u0a5c\3\2\2\2\u0a5e\u0a5d\3\2\2\2\u0a5f\u0153\3\2\2\2\u0a60\u0a62"+
		"\t*\2\2\u0a61\u0a60\3\2\2\2\u0a61\u0a62\3\2\2\2\u0a62\u0a63\3\2\2\2\u0a63"+
		"\u0a64\7\u0175\2\2\u0a64\u0155\3\2\2\2\u0a65\u0a67\t*\2\2\u0a66\u0a65"+
		"\3\2\2\2\u0a66\u0a67\3\2\2\2\u0a67\u0a68\3\2\2\2\u0a68\u0a69\7\u0176\2"+
		"\2\u0a69\u0157\3\2\2\2\u0a6a\u0a6b\t+\2\2\u0a6b\u0159\3\2\2\2\u0a6c\u0a6d"+
		"\7\u00c5\2\2\u0a6d\u015b\3\2\2\2\u0a6e\u0a6f\t,\2\2\u0a6f\u015d\3\2\2"+
		"\2\u0153\u0163\u0166\u016a\u016d\u0172\u0179\u017f\u0181\u018a\u018d\u018f"+
		"\u01a5\u01ab\u01bb\u01c2\u01c5\u01ca\u01ce\u01d7\u01dc\u01e4\u01e9\u01f2"+
		"\u01fe\u0203\u0206\u0215\u021f\u0227\u022e\u0232\u0236\u023b\u023f\u0244"+
		"\u0248\u024c\u0256\u025a\u025f\u0264\u0268\u0275\u027a\u0280\u028a\u028e"+
		"\u02a3\u02a6\u02ab\u02b0\u02b7\u02be\u02c1\u02c8\u02ce\u02d3\u02d9\u02de"+
		"\u02e1\u02e7\u02f5\u02ff\u0305\u030a\u030f\u0314\u0318\u031d\u0320\u032a"+
		"\u0336\u033d\u0340\u034c\u0351\u0356\u0359\u0360\u036c\u0379\u037b\u0380"+
		"\u0383\u0392\u0398\u03a3\u03a6\u03b0\u03b7\u03bd\u03c5\u03cf\u03e3\u03e9"+
		"\u03ed\u03f2\u03f6\u03fb\u03fe\u0403\u0406\u0414\u0433\u0435\u043a\u043e"+
		"\u0443\u044a\u044d\u0450\u0455\u0459\u045b\u0462\u0468\u046f\u0475\u047c"+
		"\u0489\u048c\u0494\u049a\u04a7\u04ac\u04b1\u04b4\u04b7\u04c2\u04cc\u04dd"+
		"\u04e6\u04eb\u04ef\u04f2\u04f7\u0501\u0506\u050b\u050f\u0515\u051b\u0525"+
		"\u0530\u0534\u0539\u053f\u0542\u054c\u0555\u055c\u0563\u0565\u056b\u056e"+
		"\u0579\u0582\u0588\u058e\u0591\u0596\u0599\u059c\u059f\u05a2\u05a8\u05b2"+
		"\u05bd\u05c0\u05c7\u05cc\u05d1\u05d5\u05dd\u05e1\u05e6\u05ea\u05ec\u05f1"+
		"\u05f9\u05fe\u0603\u060c\u0610\u061a\u062c\u0630\u063c\u0643\u0653\u065a"+
		"\u0660\u0663\u0667\u066a\u0675\u0678\u0683\u0689\u068d\u0698\u069f\u06ac"+
		"\u06af\u06b9\u06be\u06cb\u06d6\u06de\u06e2\u06e6\u06ea\u06ec\u06f1\u06f4"+
		"\u06f7\u06fa\u06fe\u0701\u0704\u0707\u070a\u0711\u071c\u0720\u0723\u0727"+
		"\u072e\u0732\u073c\u0744\u074a\u074e\u0754\u075d\u0760\u0765\u0768\u0772"+
		"\u0777\u0780\u0785\u0789\u0792\u0796\u07a4\u07b1\u07b6\u07ba\u07c0\u07cb"+
		"\u07cd\u07d1\u07d9\u07df\u07e7\u07ed\u07f2\u07fd\u0806\u080a\u0813\u0817"+
		"\u0821\u0826\u083c\u083f\u0852\u0862\u0864\u086f\u087e\u088a\u088e\u0899"+
		"\u089d\u08a9\u08ad\u08b8\u08bd\u08c2\u08c6\u08ca\u08cf\u08d3\u08d7\u08ee"+
		"\u08f0\u0902\u0904\u090c\u0911\u0916\u091b\u0928\u092d\u0932\u0937\u093c"+
		"\u0941\u0946\u094b\u094d\u0954\u0957\u0962\u096c\u0974\u097d\u0983\u0994"+
		"\u0997\u09a7\u09aa\u09ba\u09bd\u09cd\u09d0\u09e0\u09e3\u09f3\u09f6\u0a04"+
		"\u0a13\u0a17\u0a27\u0a2d\u0a32\u0a3b\u0a42\u0a44\u0a50\u0a55\u0a59\u0a5e"+
		"\u0a61\u0a66";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}