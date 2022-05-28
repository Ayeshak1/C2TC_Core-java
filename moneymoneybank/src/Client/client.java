package Client;

import com.tns.mmb.application.MMBankFactory;
import com.tns.mmb.application.MMCurrentAcc;
import com.tns.mmb.application.MMSavingAcc;
import com.tns.mmb.framework.BankFactory;
import com.tns.mmb.framework.CurrentAcc;
import com.tns.mmb.framework.SavingAcc;

public class client {



		public static void main(String[] args) {
			BankFactory bf =new MMBankFactory();
			SavingAcc sa = new MMSavingAcc(826, "ayesha", 4000, true);
			sa.withdraw(sa.accBal());
			sa.toString();
			CurrentAcc na = new MMCurrentAcc(789, "zeba", 2000, 90);
			na.withdraw(na.getcreditLimit());
			na.toString();
			
		}

	}

