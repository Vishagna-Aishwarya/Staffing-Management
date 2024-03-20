package com.staffing.serviceImpl;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.UtilityConfig;

import com.model.Candidates;
import com.model.Clients;
import com.staffing.service.ClientsService;


public abstract class ClientsServiceImpl implements ClientsService {

	Session session = UtilityConfig.getSession();
	Transaction transaction = session.beginTransaction();
	private Serializable candidateID;
	
	public int insertCandidates(Clients clnt) {
		try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(clnt);
    		transaction.commit();
    		System.out.println("Clients Details Inserted Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
		finally {
			session.close();
		}
		return 1;
	}

	public void updateCandidates(Clients clnt) {
		try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(clnt);
    		transaction.commit();
    		System.out.println("Candidate Details updated successfully for Marketing..");
        } catch (Exception e) {
            e.printStackTrace();
        }
		finally {
			session.close();
		}
	}

	public void deleteCandidates(Clients clnt) {
		try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(clnt);
    		transaction.commit();
    		System.out.println("Candidate Details deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
		finally {
			session.close();
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void displayClients(Clients clnt) {
		
		TypedQuery tq = session.createQuery("from candidates");
		List<Candidates> list = tq.getResultList();

		Iterator<Candidates> itr = list.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void getCandidates() {
		try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Candidates cndt = session.get(Clients.class, ClientID);
            transaction.commit();
            System.out.println(cndt.getCandidateID() + " " + cndt.getName() + " " + cndt.getEmail() + " " + cndt.getPhone() + " " + cndt.getSkills() + " " + cndt.getExperience() + " " + cndt.getResume());
        } catch (Exception e) {
            e.printStackTrace();
        }		
		finally {
			session.close();
		}
	}

}