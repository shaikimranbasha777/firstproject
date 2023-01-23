import java.sql.*

class KotlinTask1 {
    var conn: Connection?=null;
    fun createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "immubasha@786")
            if (conn != null){
                println("connection is done")
            }
            //println("Connecting to database")
        }catch(e: SQLException){
            println(e)
        }

    }

    fun createTable(){
        var prestat:PreparedStatement?=null;
        println("enter table name in student details database")
        var tableName = readLine()!!.toString();

        var sql = "create table $tableName(id int not null auto_increment, name varchar(255) not null, location varchar(255) not null, primary key(id));"
        try {
            prestat=conn!!.prepareStatement(sql)
            var status= prestat?.executeUpdate()
            if (status==0){
                println("table created")
            }

        }catch(e:SQLException){
            println(e)
        }
    }

    fun insertIntoTable(){
        var preStat: PreparedStatement?=null;

        println("enter table name to insert into table")
        var tableName = readLine()!!.toString();

        var sql = "insert into $tableName(name,location) values(?,?);"
        try {
            preStat = conn!!.prepareStatement(sql);
            println("Enter $tableName name")
            preStat.setString(1, readLine()!!.toString())
            println("Enter $tableName location")
            preStat.setString(2, readLine()!!.toString())

            var status = preStat.executeUpdate();
            println(status)
            if(status>0){
                println("data inserted into table")
            }
        }catch (e:SQLException){
            println(e)
        }
    }

    fun searchInTable(){
            var stm:Statement?=null;
            var res:ResultSet?=null;
            println("enter table name to search details")
            var tableName = readLine()!!.toString();
            println("Enter user ID")
            var id = readLine()!!.toInt()
            var sql= "select * from $tableName where id>$id;"
            try{
                stm=conn!!.createStatement()
                // print(res)
                res=stm!!.executeQuery(sql);
                // println(res)
                while(res!!.next()){
                    print("${res.getString("name")}\t")
                    print("${res.getString("location")}\t\n")
                }
            }catch(e:SQLException){
                println(e)
            }finally {
                if(res!=null){
                    try {
                        res.close()
                        //conn!!.close()
                        println("connection closed")
                    }catch (e:SQLException){
                        print(e)
                    }
                }
            }
        }
}

fun main(){
    var jdbcObj = KotlinTask1()
    jdbcObj.createConnection()

    while(true){
        println("Chose choice \n 1.Create Table \n 2.insert values to table \n 3.search details using id \n 4. Exit of System")
        var choice = readLine()!!.toInt()
        when(choice){
            1 -> jdbcObj.createTable();
            1 -> jdbcObj.createTable();
            2 -> jdbcObj.insertIntoTable();
            3 -> jdbcObj.searchInTable();
            4 -> System.exit(1)
            else->{
                print("Enter Valid choice")
            }
        }
    }


}