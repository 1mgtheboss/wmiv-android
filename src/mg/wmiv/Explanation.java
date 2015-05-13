package mg.wmiv;

import java.util.Random;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class Explanation extends ActionBarActivity {
	
	private InterstitialAd interstitial;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_explanation);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
		
		// Create the interstitial.
	    interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId("ca-app-pub-2738757694043962/9103685338");


interstitial.setAdListener(new AdListener() {
	        @Override
	        public void onAdLoaded() {
	          
	        	displayInterstitial();

	          
	        }
	        @Override
	        public void onAdFailedToLoad(int errorCode) {
	          
	        }
	    });
		
	    // Create ad request.
	    AdRequest adRequest = new AdRequest.Builder().build();
	    // Begin loading your interstitial.
	    interstitial.loadAd(adRequest);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.explanation, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_explanation,
					container, false);
			
			String explanations[]={"Rape in India has been described by Radha Kumar as one of India's most common crimes against women and by the UN’s human-rights chief as a \"national problem\". Marital rape is not a criminal offence.",
					"According to 2012 statistics, New Delhi has the highest number of rape-reports among Indian cities.",
					"Sources show that rape cases in India have doubled between 1990 and 2008.",
					"According to the National Crime Records Bureau, in 2012, 25,000 rape cases were reported across India. Out of these, 24,470 were committed by relative or neighbor. Men accounted to commit 98 per cent of reported rapes. The latest estimates suggest that a new case of rape is reported every 22 minutes in India.",
					"In March 2004, a 59-year old Australian Brahma Kumari adherent Dawn Griggs was murdered and raped on her way to the sect's headquarters in Mount Abu. A senior homicide police official described Ms Griggs's killing as \"savage\". She was the third expatriate woman in a period of a few months but the first to be killed. Ms Griggs was carrying $8,000 to take to them when she arrived in India. Thorns were embedded in her palms and the soles of her feet were cut, indicating she put up strong resistance. The Brahma Kumaris were founded in the 1930s and supported by a female leadership who believes those who are celibate and meditate will enjoy the fruits of paradise following the imminent destruction of the world.",
					"The rape and murder of English teenager Scarlett Keeling, on 18 February 2008, brought international attention to cases of rape in India.",
					"A Russian national working in India claimed that she was raped by a Goan politician on 1 December 2009 after having dinner with him that evening. Shantaram Laxman Naik, an MP of the Indian National Congress, occasioned widespread disapproval, when he said, \"...an alleged rape of a lady who moves with strangers for days together even beyond middle of the night is to be treated on a different footing.\" Mamata Banerji stated that free interaction between men and women today has led to these crimes.",
					"Software engineer Nayana Pujari was raped and murdered by her escort driver in Pune in 2009.",
					"The gang rape of a 23-year old student on a public bus, on 16 December 2012, sparked large protests across the capital Delhi. She was with a male friend who was severely beaten with an iron rod during the incident. This same rod was used to penetrate her so severely that the victim's intestines had to be surgically removed, before her death thirteen days after the attack. In the 24-hour period after the gang rape of the victim, at least two girls under the age of 18 were gang raped and one of them was murdered.",
					"During the partition of India, rape was an extensive issue. It is estimated that during the partition, up to 100,000 women were kidnapped and raped.",
					"There have been allegations of rape and mass rape in Jammu and Kashmir being carried out by both Indian armed forces and militant groups. In 1991, the 4 Rajputana Rifles unit are alleged to have entered the village of Kunan Poshpora and raped between 30 and 100 women aged between 13 and 70. The Indian government carried out three inquiries into the allegations and concluded that it had been a hoax.",
					"National Crime Records Bureau (NCRB) presented that Delhi had about 568 cases of rape in 2011, high compared to 218 in Mumbai. In the period of 2007-2011 period, Delhi topped the chart, followed by Mumbai, Bhopal, Pune and Jaipur. Due to the frequency of rape incidents in Delhi, it was called the \"rape capital\" of India by the Times of India. A report from September 2013 included that 1,121 rapes were recorded in last 8 months. Police regarded the rise to be \"good sign\", noting that more rape cases that more cases are now being acknowledged.",
					"In March 2013 a Swiss couple who were cycling from Orchha to Agra, were physically assailed by 8 locals, the man was overpowered and tied up while the 39-year old woman was gang-raped in front of her husband at a village in Datia District where they decided to camp for a night.",
					"The Supreme Court on 5 August 2013 directed the Madhya Pradesh Government to pay Rs 10 lakh as compensation each to the two school-going girls gang raped last year in Betma town of Indore district and issued show cause notice to a senior police officer as to why criminal case be not lodged against him for disclosing the names of victims in his affidavit, which is an offence under section 228A of the Indian Penal Code.",
					"Human rights groups allege that the Indian armed forces under the protection of the Armed Forces (Special Powers) Act, 1958 have carried out a large amount of rapes in the Nagaland, Assam and Manipur provinces.",
					"In August 2013, a School Teacher in Arunachal Pradesh was arrested for raping fourteen underage girls in a hostel where he was warden. The sexual exploitation allegedly continued for over 3 years, until one of the girls filed a police complaint.",
					"In 2011 number of brutal assaults on women were reported in Uttar Pradesh and according to the People's Union for Civil Liberties (PUCL), the majority of those assaulted were poor women from remote areas and Dalits. SR Darapuri vice president of the PUCL stated, \"I analysed the rape figures for 2007 and I found that 90% of victims were Dalits and 85% of Dalit rape victims were underage girls.\"",
					"Communal riots in India have seen rapes and gang rapes become a common phenomena in recent history. Perhaps the first riot where rape was used by rioters as a weapon (along with attacks on pregnant women) was the 2002 post-Godhra riots in the western state of Gujarat. Sexual violence was a strong component of the rioting in the 2013 Muzaffarnagar riots in Uttar Pradesh; 13 rape and assault cases were reported.",
					"According to a BBC report in February 2013, more than 7,200 children are raped each year in India. Underage victims who do report the assaults are often subjected to mistreatment and humiliation from the police. A landmark government survey in 2007 revealed that a lot of children in India are physically abused and that such occurrences are \"disturbingly common\". In January 2013, a 7-year old girl was raped in the school toilet while studying at school in Goa.",
					"On 23rd January, 2014, cops in Bengal's Birbhum district  arrested 14 men, including a village headman who had ordered the gang-rape of a 20-year-old tribal woman for alleged sexual relations with a man from outside her community.",
					"2013 Kamduni gang rape and murder case:\nOn 7 June 2013, a 20-year-old college student was abducted, gang-raped and murdered in Kamduni, near Barasat, about 20 km from Kolkata. The victim, a second year BA student of Derozio College, was walking home along the Kamduni BDO Office Road in the afternoon, when she was abducted and taken inside a factory where she was gang raped by at least nine men. After raping her, the perpetrators tore apart her legs up to the navel, slit her throat and dumped her body into a nearby field. Eight of the nine accused have been arrested. The victim's family and the villagers have steadfastly demanded justice for the victim and refused any financial help from the government.",
					"West Bengal Park Street rape case:\nA 37-year-old woman, who is a mother of two, was allegedly raped at gunpoint in a moving car on February 5, 2012. The woman claimed that she was offered a lift by the men, whom she befriended at a nightclub the same night."
			};
			Random randomNumber=new Random();
			int n=(randomNumber.nextInt(explanations.length));
			
			TextView textView = (TextView) rootView.findViewById(R.id.textView1);
			
			textView.setText(explanations[n]+"\n");
			
			
			return rootView;
		}
	}

	// Invoke displayInterstitial() when you are ready to display an interstitial.
		  public void displayInterstitial() {
		    if (interstitial.isLoaded()) {
		      interstitial.show();
		    }
		  }
}
