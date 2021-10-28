using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace VaidationExample
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        int isEmpty()
        {
            if (txtAge.TextLength == 0)
            {
                epWrong.SetError(txtAge, "Please enter age.");
                epCorrect.Clear();
                return 1;
            }
            else
            {
                return 0;
            }
        }
        int isNotNumeric()
        {
            int age;
            bool result = int.TryParse(txtAge.Text, out age);
            if (result == false)
            {
                //wrong message
                epWrong.SetError(txtAge, "Please enter a numerical age.");
                epCorrect.Clear();
                return 1;
            }
            else
            {
                return 0;
            }
        }
        private void btnSubmit_Click(object sender, EventArgs e)
        {/*
if(isEmpty()==0 && isNotNumeric()==0 && isNotInRange()==0)
do task
*/
            if (txtAge.TextLength == 0)
            {
                //wrong message
                epWrong.SetError(txtAge, "Please enter age.");
                epCorrect.Clear();
            }
            else
            {
                int age;
                bool result = int.TryParse(txtAge.Text, out age);
                if (result == false)
                {
                    //wrong message
                    epWrong.SetError(txtAge, "Please enter a numerical age.");
                    epCorrect.Clear();
                }
                else
                {
                    if (age < 6 || age > 19)
                    {
                        //wrong message
                        epWrong.SetError(txtAge, "Age shoul be in between 6 and 19.");
                        epCorrect.Clear();
                    }
                    else
                    {
                        //correct message
                        epCorrect.SetError(txtAge, "Age is correctly entered.");
                        epWrong.Clear();
                    }
                }

            }
        }
    }
}