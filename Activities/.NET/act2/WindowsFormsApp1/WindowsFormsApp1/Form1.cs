using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int num1;
            int num2;

            try
            {
                num1 = Convert.ToInt16(textBox1.Text);
                num2 = Convert.ToInt16(textBox2.Text);

                int answer = num1 / num2;
                label1.Text = answer.ToString();
            }

            catch (DivideByZeroException ex)
            {
                MessageBox.Show(string.Format("Aiyoo, yu dum fuk {0}", ex.Message.ToString()));
            }

            catch (FormatException)
            {
                MessageBox.Show(string.Format("Fucked. You are very dumb arnt you?"));
            }
            catch (OverflowException) { 
                MessageBox.Show(string.Format("Loku wadee..", MessageBoxButtons.OK, MessageBoxIcon.Error))
            }


        }
    }
}
