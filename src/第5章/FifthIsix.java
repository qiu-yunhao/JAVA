package 第5章;
import java.time.*;
public class FifthIsix
{}
class Employee1 extends Person
    {
        private double salary;
        private LocalDate hireDay;
        public Employee1(String name,double salary,int year,int month,int day)
        {
            super(name);
            this.salary=salary;
            hireDay=LocalDate.of(year,month,day);
        }
        public double getSalary() {
            return salary;
        }

        public LocalDate getHireDay() {
            return hireDay;
        }

        @Override
        public String getDescription() {
            return String.format("an employee with a salary of $%.2f",salary);
        }
        public void raiseSalary(double bypercent)
        {
            double raise = salary*bypercent/100;
            salary+=raise;
        }
    }


