package polymorphism;

public class Demo {
    public static void main(String[] args) throws Exception {
        // 多型: 允許用父類別的型別來宣告變數
        // -------不用多型處理-------
        Employee em1            = new Employee("E11", 30000);
        SalesEmployee sem1      = new SalesEmployee("E12", 20000, 1.5);
        PartTimeEmployee pt1    = new PartTimeEmployee("E13", 500, 20);

        em1.calculateSalary();
        sem1.calculateSalary();
        pt1.calculateSalary();
        // -------不用多型處理-------

        // -------用多型處理-------
        Employee em2    = new Employee("E21", 30000);
        Employee sem2   = new SalesEmployee("E22", 20000, 1.5);
        Employee pt2    = new PartTimeEmployee("E23", 500, 20);

        em2.calculateSalary();
        sem2.calculateSalary();
        pt2.calculateSalary();
        // -------用多型處理-------

        // -------用多型 + ARRAY + FOR lOOP處理-------
        Employee[] employees = {
            new Employee("E31", 30000),
            new SalesEmployee("E32", 20000, 1.5),
            new PartTimeEmployee("E33", 500, 20),
            new PartTimeEmployee("E34", 500, 30),
            new SalesEmployee("E35", 20000, 3.5),
        };

        for(int i = 0; i < employees.length; i++) {
            employees[i].calculateSalary();
        }
        // -------用多型處理-------
    }
}
