import database.DatabaseInitService;
import database.DatabasePopulateService;
import database.DatabaseQueryService;

import java.sql.SQLException;

public class DatabaseTest {
    public static void main(String[] args) throws SQLException {
        DatabaseInitService databaseInitService = new DatabaseInitService();
        databaseInitService.databaseInit();

        DatabasePopulateService databasePopulateService = new DatabasePopulateService();
        databasePopulateService.databasePopulate();

        DatabaseQueryService databaseQueryService = new DatabaseQueryService();
        databaseQueryService.findMaxProjectsClient();
        databaseQueryService.findLongestProject();
        databaseQueryService.findYoungestAndEldestWorkers();
        databaseQueryService.findMaxSalaryWorker();
        databaseQueryService.printProfectPrices();
    }
}
