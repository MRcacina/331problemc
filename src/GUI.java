import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

public class GUI extends JPanel {

	void play() throws InterruptedException {

		ArrayList<BusTrips> BusTripsArray = new ArrayList<BusTrips>();

		System.out.println("Welcome to Train Program.");

		System.out.println("Please write start and press enter to continue.");

		Scanner s = new Scanner(System.in);

		String temp = s.next();

		while (true) {

			System.out.println("Which operation would you like to do ?");

			System.out.println("Press 1 to add Bus Trip");

			System.out.println("Press 2 to Sell Ticket");

			System.out.println("Press 3 to edit Boarding Information");

			System.out.println("Press 4 to add Baggage Information");

			System.out.println("Press 5 to list all Bus Trips");

			System.out.println("Press 6 to list all Passengers in a Bus Trip");

			String first = s.next();

			if (first.equals("1")) {

				System.out.println("Please enter the departure location");

				String depLoc = s.next();

				System.out.println("Please enter the arrival location");

				String arrLoc = s.next();

				System.out.println("Please enter the departure time");

				String depTime = s.next();

				System.out.println("Please enter the arrival time");

				String arrTime = s.next();

				BusTripsArray.add(new BusTrips(depLoc, arrLoc, depTime, arrTime));

				System.out.println("Bus trip added.");

				System.out.println("\n" + "\n");

			}

			else if (first.equals("2")) {

				System.out.println("For which trip you would like to sell ticket");

				System.out.println("Please enter the departure location.");

				String depLoc = s.next();

				System.out.println("Please enter the arrival location");

				String arrLoc = s.next();

				System.out.println("Please enter the departure time");

				String depTime = s.next();

				for (BusTrips b : BusTripsArray) {

					if (depLoc.equals(b.getDepartureLocation()) && arrLoc.equals(b.getArrrivalLocation())
							&& depTime.equals(b.getDepartureTime())) {

						TicketSeller t = new TicketSeller();

						b.getPassengerList().add(t.sellTicket());

						System.out.println("Passenger successfully added to the trip");

					}

				}

				System.out.println("\n" + "\n");

			}

			else if (first.equals("3")) {

				System.out.println("For which trip you would like to edit boarding information ?");

				System.out.println("Please enter the departure location.");

				String depLoc = s.next();

				System.out.println("Please enter the arrival location");

				String arrLoc = s.next();

				System.out.println("Please enter the departure time");

				String depTime = s.next();

				for (BusTrips b : BusTripsArray) {

					if (depLoc.equals(b.getDepartureLocation()) && arrLoc.equals(b.getArrrivalLocation())
							&& depTime.equals(b.getDepartureTime())) {

						System.out.println("For which passenger you would like to edit the boarding information ?");

						Operator o = new Operator();

						o.setBoardedInformation(b.getPassengerList());

					}

				}

				System.out.println("\n" + "\n");

			}

			else if (first.equals("4")) {

				System.out.println("For which trip you would like to edit Baggage Information ?");

				System.out.println("Please enter the departure location.");

				String depLoc = s.next();

				System.out.println("Please enter the arrival location");

				String arrLoc = s.next();

				System.out.println("Please enter the departure time");

				String depTime = s.next();

				for (BusTrips b : BusTripsArray) {

					if (depLoc.equals(b.getDepartureLocation()) && arrLoc.equals(b.getArrrivalLocation())
							&& depTime.equals(b.getDepartureTime())) {

						System.out.println("For which passenger you would like to add the baggage ID ?");

						Operator o = new Operator();

						o.addBaggageID(b.getPassengerList());

					}

				}

				System.out.println("\n" + "\n");

			}

			else if (first.equals("5")) {

				for (BusTrips b : BusTripsArray) {

					System.out.println("Departure Location : " + b.getDepartureLocation() + ", Arrival Location : "
							+ b.getArrrivalLocation() + ", Departure Time : " + b.getDepartureTime()
							+ ", Arrival Time : " + b.getArrivalTime());

				}

				System.out.println("\n" + "\n");

			}

			else if (first.equals("6")) {

				System.out.println("For which trip you would like to display passenger list ?");

				System.out.println("Please enter the departure location.");

				String depLoc = s.next();

				System.out.println("Please enter the arrival location");

				String arrLoc = s.next();

				System.out.println("Please enter the departure time");

				String depTime = s.next();

				for (BusTrips b : BusTripsArray) {

					if (depLoc.equals(b.getDepartureLocation()) && arrLoc.equals(b.getArrrivalLocation())
							&& depTime.equals(b.getDepartureTime())) {

						for (Passenger p : b.getPassengerList()) {

							System.out.println("Passenger TC No : " + p.getTcNO() + ", Passenger Name : " + p.getName()
									+ ", Passenger Last Name : " + p.getSurname() + ", Passenger Mail Adress : "
									+ p.getMail() + ", Passenger Phone Number : " + p.getMobileTel() + ", isBoarded : " + 
									p.isBoarded() + ", Baggage ID : " + p.getBaggageID());

						}

					}

				}

				System.out.println("\n" + "\n");

			} // End of infinite while

		}

	} // End of play method.

} // End of class.
