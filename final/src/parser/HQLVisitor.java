package parser;// Generated from C:/Users/muzna/Desktop/4th/compiler/final/src\HQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HQLParser}.
 *
 * @param <T> The return type of the visit operator. Use {@link Void} for
 * operations with no return type.
 */
public interface HQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HQLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HQLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HQLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(HQLParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(HQLParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(HQLParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(HQLParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_stmt(HQLParser.Semicolon_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HQLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(HQLParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(HQLParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(HQLParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(HQLParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(HQLParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_item(HQLParser.Assignment_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_single_item(HQLParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_multiple_item(HQLParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_select_item(HQLParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(HQLParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(HQLParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(HQLParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(HQLParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(HQLParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_item(HQLParser.Declare_cursor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#cursor_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_with_return(HQLParser.Cursor_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#cursor_without_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_without_return(HQLParser.Cursor_without_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(HQLParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_temporary_table_item(HQLParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(HQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#delm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelm(HQLParser.DelmContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(HQLParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(HQLParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(HQLParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(HQLParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(HQLParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(HQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(HQLParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(HQLParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(HQLParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(HQLParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(HQLParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(HQLParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(HQLParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(HQLParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(HQLParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(HQLParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(HQLParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(HQLParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(HQLParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(HQLParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(HQLParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(HQLParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(HQLParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(HQLParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(HQLParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(HQLParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(HQLParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(HQLParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(HQLParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#fanc_param_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFanc_param_elem(HQLParser.Fanc_param_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#elems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElems(HQLParser.ElemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(HQLParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#if_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_in_func(HQLParser.If_in_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#if_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_rest(HQLParser.If_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(HQLParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#elsee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsee(HQLParser.ElseeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#for_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_func(HQLParser.For_in_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#for_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_params(HQLParser.For_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#for_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_param(HQLParser.For_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#creat_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreat_return(HQLParser.Creat_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#assignment_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_in_func(HQLParser.Assignment_in_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#assignment_0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_0(HQLParser.Assignment_0Context ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(HQLParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#declare_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_rest(HQLParser.Declare_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#assignment_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_1(HQLParser.Assignment_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#assignment_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_2(HQLParser.Assignment_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#assingnment_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingnment_rest(HQLParser.Assingnment_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(HQLParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(HQLParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(HQLParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(HQLParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(HQLParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(HQLParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(HQLParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(HQLParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(HQLParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(HQLParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(HQLParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(HQLParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(HQLParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(HQLParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(HQLParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(HQLParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(HQLParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(HQLParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(HQLParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(HQLParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(HQLParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#index_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_storage_clause(HQLParser.Index_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_mssql_storage_clause(HQLParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#set_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_option(HQLParser.Set_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_current_schema_option(HQLParser.Set_current_schema_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mssql_session_option(HQLParser.Set_mssql_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_teradata_session_option(HQLParser.Set_teradata_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(HQLParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cursor_stmt(HQLParser.For_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(HQLParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(HQLParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(HQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(HQLParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(HQLParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(HQLParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(HQLParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(HQLParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(HQLParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(HQLParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(HQLParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(HQLParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(HQLParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(HQLParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(HQLParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(HQLParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(HQLParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(HQLParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(HQLParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(HQLParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(HQLParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(HQLParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(HQLParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(HQLParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(HQLParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(HQLParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(HQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(HQLParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(HQLParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(HQLParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(HQLParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(HQLParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(HQLParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(HQLParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(HQLParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(HQLParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(HQLParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(HQLParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(HQLParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(HQLParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(HQLParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(HQLParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(HQLParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(HQLParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(HQLParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(HQLParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(HQLParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(HQLParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(HQLParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(HQLParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(HQLParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(HQLParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(HQLParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(HQLParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(HQLParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(HQLParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(HQLParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(HQLParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(HQLParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(HQLParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(HQLParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(HQLParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link HQLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(HQLParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link HQLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(HQLParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(HQLParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(HQLParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(HQLParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(HQLParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link HQLParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(HQLParser.Non_reserved_wordsContext ctx);
}