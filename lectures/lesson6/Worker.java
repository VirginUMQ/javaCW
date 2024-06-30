public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override // Выводить значения работников
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Номер: %d Имя: %s Фамилия: %s Зарплата: %d", id, firstName, lastName, salary);
    }


    @Override // сравнивать работников
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Worker t = (Worker) obj;
        return id == t.id && firstName == t.firstName; 
    }


    @Override // сравнивать работников 
    public int hashCode() {
        // TODO Auto-generated method stub
        return id;  
    } 



}
