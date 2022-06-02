import java.sql.SQLOutput;

class Intern extends Employee{
        private int maxSalary;

        public Intern(int maxSalary, String name, String department, int salary, String location) {
            super(name, department, salary, location);
            setMaxSalary(maxSalary);
        }

        //SETTERS
        public void setMaxSalary(int maxSalary){
            this.maxSalary = maxSalary;
            /*if(maxSalary > 20000){
                System.out.println("Max salary exceeded");
            } else {
                this.maxSalary = maxSalary;
                System.out.println("Correct salary: " + maxSalary );
            }*/
        }

        //GETTERS
        public boolean getMaxSalary( ){
            int internSalary = maxSalary > 20000;

            if (internSalary == true ) {
                maxSalary = new String("Max salary exceeded");
            } else {
                return maxSalary;
            }
            return maxSalary;
        }

        //INTENTO 2
    /*private static int MAX=20000;
    private static int MIN=0;

    public int getMaxSalary(int a) {
        return (a > MAX) ? MAX : (a < MIN ? MIN: a );
    }*/

    //INTENTO 1
            /*if(maxSalary > 20000){
                System.out.println("Max salary exceeded");
            } else {
                //this.maxSalary = maxSalary;
                return  maxSalary;
            }*/

    //INTENTO OPERADOR TERNARIO
            /*int internSalary = maxSalary > 20000;
            maxSalary = internSalary ? "Max salary exceeded" : "Correct salary";
            return this.maxSalary;*/
        }
    }

