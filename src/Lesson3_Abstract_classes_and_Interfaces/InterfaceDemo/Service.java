package Lesson3_Abstract_classes_and_Interfaces.InterfaceDemo;

public class Service 
{
    public static void main(String[] args) 
    {
        iRepository repo = new MySQLRepository();
        
        private iRepository repo;

        // Constructor Injection
        public Service(IRepo repo) 
        {
            this.repo = repo;
        }

        public void fetchUsers() {
            repo.getUser(); // Calls the implemented method from MySQLRepository or MyDBRepository
        }
        
    }

}
