import org.springframework.transaction.PlatformTransactionManager

// Place your Spring DSL code here
beans = {
    transactionManager_lookup(PlatformTransactionManager, ref("dataSource_lookup"))
}
