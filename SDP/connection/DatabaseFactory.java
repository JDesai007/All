public class DatabaseFactory
{
   public static Database getDb(int i)
   {
	   Database db;
       switch(i)
	   {
		   case 1: db=new mysql();
		           break;
		   case 2: db=new postgres();
		           break;
		   case 3: db=new sqlite();
		           break;
		   default:db=null;
		            break;
			        
	   }
	   return db;
   }
}