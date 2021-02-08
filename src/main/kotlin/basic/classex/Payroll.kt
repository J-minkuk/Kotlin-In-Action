package basic.classex

/**
 * 설명 : singleton
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 09.
 */
object Payroll {
    val allEmployees = arrayListOf<Employee>()

    fun calculateSalary() {
        for (employee in allEmployees) {
            // ...
        }
    }
}

class Employee