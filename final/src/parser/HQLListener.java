package parser;// Generated from C:/Users/muzna/Desktop/4th/compiler/final/src\HQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HQLParser}.
 */
public interface HQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HQLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HQLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HQLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HQLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HQLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(HQLParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(HQLParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_block_stmt(HQLParser.Single_block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_block_stmt(HQLParser.Single_block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(HQLParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(HQLParser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void enterProc_block(HQLParser.Proc_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void exitProc_block(HQLParser.Proc_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_stmt(HQLParser.Semicolon_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_stmt(HQLParser.Semicolon_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(HQLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(HQLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void enterException_block(HQLParser.Exception_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void exitException_block(HQLParser.Exception_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void enterException_block_item(HQLParser.Exception_block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void exitException_block_item(HQLParser.Exception_block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(HQLParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(HQLParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(HQLParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(HQLParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(HQLParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(HQLParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_item(HQLParser.Assignment_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_item(HQLParser.Assignment_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_single_item(HQLParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_single_item(HQLParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_multiple_item(HQLParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_multiple_item(HQLParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_select_item(HQLParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_select_item(HQLParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(HQLParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(HQLParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block_inplace(HQLParser.Declare_block_inplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block_inplace(HQLParser.Declare_block_inplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_item(HQLParser.Declare_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_item(HQLParser.Declare_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_item(HQLParser.Declare_var_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_item(HQLParser.Declare_var_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_condition_item(HQLParser.Declare_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_condition_item(HQLParser.Declare_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_item(HQLParser.Declare_cursor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_item(HQLParser.Declare_cursor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_with_return(HQLParser.Cursor_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_with_return(HQLParser.Cursor_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_without_return(HQLParser.Cursor_without_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_without_return(HQLParser.Cursor_without_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_handler_item(HQLParser.Declare_handler_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_handler_item(HQLParser.Declare_handler_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_temporary_table_item(HQLParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_temporary_table_item(HQLParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(HQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(HQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#delm}.
	 * @param ctx the parse tree
	 */
	void enterDelm(HQLParser.DelmContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#delm}.
	 * @param ctx the parse tree
	 */
	void exitDelm(HQLParser.DelmContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(HQLParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(HQLParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_local_temp_table_stmt(HQLParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_local_temp_table_stmt(HQLParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(HQLParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(HQLParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns(HQLParser.Create_table_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns(HQLParser.Create_table_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns_item(HQLParser.Create_table_columns_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns_item(HQLParser.Create_table_columns_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(HQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(HQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_inline_cons(HQLParser.Create_table_column_inline_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_inline_cons(HQLParser.Create_table_column_inline_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_cons(HQLParser.Create_table_column_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_cons(HQLParser.Create_table_column_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_fk_action(HQLParser.Create_table_fk_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_fk_action(HQLParser.Create_table_fk_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions(HQLParser.Create_table_preoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions(HQLParser.Create_table_preoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_item(HQLParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_item(HQLParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_td_item(HQLParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_td_item(HQLParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options(HQLParser.Create_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options(HQLParser.Create_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_item(HQLParser.Create_table_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_item(HQLParser.Create_table_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_ora_item(HQLParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_ora_item(HQLParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_db2_item(HQLParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_db2_item(HQLParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_td_item(HQLParser.Create_table_options_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_td_item(HQLParser.Create_table_options_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_hive_item(HQLParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_hive_item(HQLParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format(HQLParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format(HQLParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format_fields(HQLParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format_fields(HQLParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mssql_item(HQLParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mssql_item(HQLParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mysql_item(HQLParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mysql_item(HQLParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(HQLParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(HQLParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(HQLParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(HQLParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void enterDtype_attr(HQLParser.Dtype_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void exitDtype_attr(HQLParser.Dtype_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void enterDtype_default(HQLParser.Dtype_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void exitDtype_default(HQLParser.Dtype_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(HQLParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(HQLParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(HQLParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(HQLParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(HQLParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(HQLParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#fanc_param_elem}.
	 * @param ctx the parse tree
	 */
	void enterFanc_param_elem(HQLParser.Fanc_param_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#fanc_param_elem}.
	 * @param ctx the parse tree
	 */
	void exitFanc_param_elem(HQLParser.Fanc_param_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#elems}.
	 * @param ctx the parse tree
	 */
	void enterElems(HQLParser.ElemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#elems}.
	 * @param ctx the parse tree
	 */
	void exitElems(HQLParser.ElemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(HQLParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(HQLParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#if_in_func}.
	 * @param ctx the parse tree
	 */
	void enterIf_in_func(HQLParser.If_in_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#if_in_func}.
	 * @param ctx the parse tree
	 */
	void exitIf_in_func(HQLParser.If_in_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#if_rest}.
	 * @param ctx the parse tree
	 */
	void enterIf_rest(HQLParser.If_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#if_rest}.
	 * @param ctx the parse tree
	 */
	void exitIf_rest(HQLParser.If_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(HQLParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(HQLParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#elsee}.
	 * @param ctx the parse tree
	 */
	void enterElsee(HQLParser.ElseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#elsee}.
	 * @param ctx the parse tree
	 */
	void exitElsee(HQLParser.ElseeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#for_in_func}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_func(HQLParser.For_in_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#for_in_func}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_func(HQLParser.For_in_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#for_params}.
	 * @param ctx the parse tree
	 */
	void enterFor_params(HQLParser.For_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#for_params}.
	 * @param ctx the parse tree
	 */
	void exitFor_params(HQLParser.For_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#for_param}.
	 * @param ctx the parse tree
	 */
	void enterFor_param(HQLParser.For_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#for_param}.
	 * @param ctx the parse tree
	 */
	void exitFor_param(HQLParser.For_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#creat_return}.
	 * @param ctx the parse tree
	 */
	void enterCreat_return(HQLParser.Creat_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#creat_return}.
	 * @param ctx the parse tree
	 */
	void exitCreat_return(HQLParser.Creat_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#assignment_in_func}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_in_func(HQLParser.Assignment_in_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#assignment_in_func}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_in_func(HQLParser.Assignment_in_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#assignment_0}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_0(HQLParser.Assignment_0Context ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#assignment_0}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_0(HQLParser.Assignment_0Context ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(HQLParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(HQLParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#declare_rest}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_rest(HQLParser.Declare_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#declare_rest}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_rest(HQLParser.Declare_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#assignment_1}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_1(HQLParser.Assignment_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#assignment_1}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_1(HQLParser.Assignment_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#assignment_2}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_2(HQLParser.Assignment_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#assignment_2}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_2(HQLParser.Assignment_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#assingnment_rest}.
	 * @param ctx the parse tree
	 */
	void enterAssingnment_rest(HQLParser.Assingnment_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#assingnment_rest}.
	 * @param ctx the parse tree
	 */
	void exitAssingnment_rest(HQLParser.Assingnment_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_return(HQLParser.Create_function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_return(HQLParser.Create_function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(HQLParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(HQLParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(HQLParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(HQLParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec_item(HQLParser.Package_spec_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec_item(HQLParser.Package_spec_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(HQLParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(HQLParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(HQLParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(HQLParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_item(HQLParser.Package_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_item(HQLParser.Package_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(HQLParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(HQLParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_params(HQLParser.Create_routine_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_params(HQLParser.Create_routine_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_param_item(HQLParser.Create_routine_param_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_param_item(HQLParser.Create_routine_param_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_options(HQLParser.Create_routine_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_options(HQLParser.Create_routine_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_option(HQLParser.Create_routine_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_option(HQLParser.Create_routine_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(HQLParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(HQLParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_plsql_stmt(HQLParser.If_plsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_plsql_stmt(HQLParser.If_plsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_tsql_stmt(HQLParser.If_tsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_tsql_stmt(HQLParser.If_tsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_bteq_stmt(HQLParser.If_bteq_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_bteq_stmt(HQLParser.If_bteq_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(HQLParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(HQLParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(HQLParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(HQLParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(HQLParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(HQLParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(HQLParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(HQLParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_col(HQLParser.Create_index_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_col(HQLParser.Create_index_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_storage_clause(HQLParser.Index_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_storage_clause(HQLParser.Index_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_mssql_storage_clause(HQLParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_mssql_storage_clause(HQLParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_option(HQLParser.Set_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_option(HQLParser.Set_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_current_schema_option(HQLParser.Set_current_schema_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_current_schema_option(HQLParser.Set_current_schema_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_mssql_session_option(HQLParser.Set_mssql_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_mssql_session_option(HQLParser.Set_mssql_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_teradata_session_option(HQLParser.Set_teradata_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_teradata_session_option(HQLParser.Set_teradata_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(HQLParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(HQLParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_cursor_stmt(HQLParser.For_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_cursor_stmt(HQLParser.For_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_stmt(HQLParser.For_range_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_stmt(HQLParser.For_range_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(HQLParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(HQLParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(HQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(HQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt(HQLParser.Cte_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt(HQLParser.Cte_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt_item(HQLParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt_item(HQLParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_cols(HQLParser.Cte_select_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_cols(HQLParser.Cte_select_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt(HQLParser.Fullselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt(HQLParser.Fullselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt_item(HQLParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt_item(HQLParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_set_clause(HQLParser.Fullselect_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_set_clause(HQLParser.Fullselect_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_stmt(HQLParser.Subselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_stmt(HQLParser.Subselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(HQLParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(HQLParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_set(HQLParser.Select_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_set(HQLParser.Select_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_limit(HQLParser.Select_list_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_limit(HQLParser.Select_list_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_item(HQLParser.Select_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_item(HQLParser.Select_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_alias(HQLParser.Select_list_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_alias(HQLParser.Select_list_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_asterisk(HQLParser.Select_list_asteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_asterisk(HQLParser.Select_list_asteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(HQLParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(HQLParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(HQLParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(HQLParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_clause(HQLParser.From_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_clause(HQLParser.From_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name_clause(HQLParser.From_table_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name_clause(HQLParser.From_table_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subselect_clause(HQLParser.From_subselect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subselect_clause(HQLParser.From_subselect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_clause(HQLParser.From_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_clause(HQLParser.From_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_type_clause(HQLParser.From_join_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_type_clause(HQLParser.From_join_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_clause(HQLParser.From_table_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_clause(HQLParser.From_table_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_row(HQLParser.From_table_values_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_row(HQLParser.From_table_values_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_alias_clause(HQLParser.From_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_alias_clause(HQLParser.From_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(HQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(HQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(HQLParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(HQLParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(HQLParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(HQLParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(HQLParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(HQLParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(HQLParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(HQLParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(HQLParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(HQLParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#select_options}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options(HQLParser.Select_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#select_options}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options(HQLParser.Select_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options_item(HQLParser.Select_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options_item(HQLParser.Select_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(HQLParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(HQLParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(HQLParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(HQLParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(HQLParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(HQLParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_single_in(HQLParser.Bool_expr_single_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_single_in(HQLParser.Bool_expr_single_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_multi_in(HQLParser.Bool_expr_multi_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_multi_in(HQLParser.Bool_expr_multi_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(HQLParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(HQLParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(HQLParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(HQLParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(HQLParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(HQLParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(HQLParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(HQLParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(HQLParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(HQLParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(HQLParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(HQLParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(HQLParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(HQLParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(HQLParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(HQLParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(HQLParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(HQLParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(HQLParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(HQLParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(HQLParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(HQLParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cursor_attribute(HQLParser.Expr_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cursor_attribute(HQLParser.Expr_cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(HQLParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(HQLParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(HQLParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(HQLParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(HQLParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(HQLParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(HQLParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(HQLParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(HQLParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(HQLParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(HQLParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(HQLParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(HQLParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(HQLParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(HQLParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(HQLParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(HQLParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(HQLParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(HQLParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(HQLParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(HQLParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(HQLParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link HQLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotedString(HQLParser.Single_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link HQLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotedString(HQLParser.Single_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link HQLParser#string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotedString(HQLParser.Double_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link HQLParser#string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotedString(HQLParser.Double_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(HQLParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(HQLParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(HQLParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(HQLParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(HQLParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(HQLParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(HQLParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(HQLParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link HQLParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(HQLParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HQLParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(HQLParser.Non_reserved_wordsContext ctx);
}