// Q1 =============================================================

        //c --------------------------------------
        //public void btnAdd_Click (object sender, EventArgs e){

            Sqlconnection con = new SqlConnection("ConnectionString");

            string query1 = ("INSERT INTO Instergram_Users VALUES ('" + 
            txtMemNo.Text + "', '" + txtMemName.Text + "', '" + txtState.Text +
            "', '" + txtCountry.Text + "');");

            SqlCommand addingCommad = new SqlCommand(query1, con);

            con.Open();
            addingCommad.ExecuteNonQuery();
            con.Close();

        }

        // d ------------------------------------------

        //public void btnView_Click (object sender, EventArgs e){
            Sqlconnection con = new SqlConnection("ConnectionString");
            
            string query1 = ("SELECT * FROM Instagram_users")
            
            con.Open();
            sqladapt = new SqlDataAdapter(query1, con);
            
            DataTable dt = new DataTable();
            sqladapt.Fill(dt);
            dataGridView1.DataSource = dt;
            con.Close();
        }

        // e ------------------------------------------
        //public void btnUJpdate_Click(object sender, EventArgs e){
            Sqlconnection con = new SqlConnection("ConnectionString");

            string query2 = ("UPDATE Instagram_users SET Member_name='" +
            txtMemName.Text + "', state = '" + txtState.Text + "', country ='" +
            txtCountry.Text + "' Where memeber_no='" + txtMemNo.Text +
            "';");

            SqlCommand addingCommad = new SqlCommand(query2, con);

            con.Open();
            addingCommad.ExecuteNonQuery();
            con.Close();

        }

        // f ------------------------------------------
        //public void btnDelete_Click(object sender, EventArgs e){
            Sqlconnection con = new SqlConnection("ConnectionString");

            string query2 = ("DELETE from Instagram_Users where member_no='" +
            txtMemNo.Text + "';");

            SqlCommand addingCommad = new SqlCommand(query2, con);

            con.Open();
            addingCommad.ExecuteNonQuery();
            con.Close();
    }


// Q2 =============================================================

// c ---------------------------------------------------------




namespace encap
{
    class Demo
    {
        private int _mark;
        public int Mark
        {
            get
            {
                return _mark;
            }
            set
            {
                _mark = value;
            }
        }
    }


    class Program
    {
        static void Main(string[] args)
        {
            Demo obj1 = new Demo();
            obj1.Mark = 10;
        }
    }
}



// d ---------------------------------------------------------

namespace inheritanceDemo{
    class staff{
        public string sName = "Jagath";
    }

    class teacher: staff{
        public string subject = "Science";

        public void funktion1(){
            Console.WriteLine(sName + " " subject);
        }
    }

    class Program{
        static void Main(string[] args){
            teacher obj1 = new teacher();
            obj1.funktion1();
        }
    }
}



// e --------------------------------------------------------------------


using System;

namespace abstractClass
{
    abstract class Animal
    {
        public abstract void animalSound();
    }

    class Pig : Animal
    {
        public override void animalSound()
        {
            Console.WriteLine("The pig says: wee wee");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Pig myPig = new Pig();
            myPig.animalSound();

        }
    }
}



// Q3 ==================================================================

// a ----------------------------------------------------------------------
using System;

public class Example
{
   public static void Main()
   {
      int number1 = 3000;
      int number2 = 0;
      try {
         Console.WriteLine(number1 / number2);
      }
      catch (DivideByZeroException) {
         Console.WriteLine("Division of {0} by zero.", number1);
      }
   }
}


// b -------------------------------------------------------------------------
using System;

namespace CEB {
    public partial class form1 : Form{

        public float taxRate = 0.0f, unitPrice = 0.0f, billAmm =0.0f, taxAmm =0.0f, totBill = 0.0f;
        
        public void btnCalculate_Click(object sender, EventArgs e){
            if (comboCustomerType.Text == "Domestic"){
                
                if (int.Parse(txtUnits.Text) > 100){
                    unitPrice = 30.0f;
                    taxRate = 5.0f;
                } else if (int.Parse(txtUnits.Text) > 50){
                    unitPrice 30.0f;
                    taxRate = 5.0f;
                } else {
                    unitPrice = 10.0f;
                    taxRate = 2.0f;
                }

            } else {
                if (int.Parse(txtUnits.Text) > 100){
                    unitPrice = 100.0f;
                    taxRate = 10.0f;

                } else if (int.Parse(txtUnits.Text)>50){
                    unitPrice = 50.0f;
                    taxRate = 8.0f;

                } else{
                    unitPrice = 20.0f;
                    taxRate = 5.0f;

                }
            }

            billAmm = txtUnits * unitPrice;
            taxAmm = billAmm * taxRate;
            totBill = billAmm + taxAmm;

            lblBillAmm.Content = billAmm;
            lblTaxAmm.Content = taxAmm;
            lblTotBill.Content = totBill;
        }
    }
}


// ==================================== END ========================================

























