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

            con.Open();
            DataTable dt = new DataTable();
            con.Close();
            sqladapt = new SqlDataAdapter("SELECT * FROM Instagram_users", con);
            sqladapt.Fill(dt);
            dataGridView1.DataSource = dt;
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






































