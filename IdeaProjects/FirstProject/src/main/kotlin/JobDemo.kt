import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.Statement
import java.sql.ResultSet

class JobDemo {
    var conn: Connection?=null;
    fun createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "immubasha@786")
            if (conn != null){
                println("connection is done")
            }
            //println("Connecting to database")
        }catch(e:SQLException){
            println(e)
        }

    }
    fun executeQueryOfDataBase(){
        var stm:Statement?=null;
        var res:ResultSet?=null;
        var sql= "show tables;"
        try{
            stm=conn!!.createStatement()
            print(res)
            res=stm!!.executeQuery(sql);
            println(res)
            while(res!!.next()){
                println(res.getString("Tables_in_banksystem"))
            }
        }catch(e:SQLException){
            println(e)
        }finally {
            if(res!=null){
                try {
                    res.close()
                   // conn!!.close()
                    //println("connection closed")
                }catch (e:SQLException){
                    print(e)
                }
            }
        }
    }

    fun selectQuery(){
        var stm:Statement?=null;
        var res:ResultSet?=null;
        println("Enter user ID")
        var id = readLine()!!.toInt()
        var sql= "select * from account where accountid>$id;"
        try{
            stm=conn!!.createStatement()
           // print(res)
            res=stm!!.executeQuery(sql);
           // println(res)
            while(res!!.next()){

                print("${res.getInt("accountid")}\t")
                print("${res.getLong("accountno")}\t")
                print("${res.getString("accounttype")}\t")
                print("${res.getFloat("accountbalance")}\t")
                print("${res.getInt("customerid")}\t")
                print("${res.getInt("bankid")}\t\n")
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

    fun createTable(){
        var prestat:PreparedStatement?=null;
        var sql = "create table user(id int not null auto_increment, name varchar(255) not null, age int not null, primary key(id));"
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
    fun createTableUsingStatement(){
        var stm:Statement?=null;
        var sql = "create table user1(id int not null auto_increment, name varchar(255) not null, age int not null, primary key(id));"
        try {
            stm=conn!!.createStatement()
            stm.execute(sql)
            print("table is crated")
        }catch(e:SQLException){
            println(e)
        }
    }

    fun insertIntoTable(){
        var preStat:PreparedStatement?=null;

        var sql = "insert into user(name,age) values(?,?);"
        try {
            preStat = conn!!.prepareStatement(sql);
            preStat.setString(1, readLine()!!.toString())
            preStat.setInt(2, readLine()!!.toInt())
            var status = preStat.executeUpdate();
            println(status)
            if(status>0){
                println("data inserted into table")
            }
        }catch (e:SQLException){
            println(e)
        }

    }
    fun updateTable(){
        var preStat:PreparedStatement?=null;
        var sql = "update user set name=? where id=?"
        try {
            preStat = conn!!.prepareStatement(sql);

        }catch (e:SQLException){

        }
    }

}

fun main() {
    var jdbcObj = JobDemo()
    println("system")
    jdbcObj.createConnection()
    //jdbcObj.executeQueryOfDataBase()
    //jdbcObj.selectQuery()
    //jdbcObj.createTable()
    //jdbcObj.createTableUsingStatement()
    jdbcObj.insertIntoTable()

}
