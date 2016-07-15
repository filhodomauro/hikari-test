import org.grails.orm.hibernate.GrailsHibernateTransactionManager
import org.springframework.transaction.PlatformTransactionManager

// Place your Spring DSL code here
beans = {
    transactionManager_lookup(GrailsHibernateTransactionManager)
}
