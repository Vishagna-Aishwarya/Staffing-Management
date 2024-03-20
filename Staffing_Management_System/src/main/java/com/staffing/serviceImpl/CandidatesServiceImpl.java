package com.staffing.serviceImpl;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.UtilityConfig;

import com.model.Candidates;
import com.staffing.service.CandidatesService;

public abstract class CandidatesServiceImpl implements CandidatesService {

	Session session = UtilityConfig.getSession();
	Transaction transaction = session.beginTransaction();
	private Serializable candidateID;
	
	public int insertCandidates(Candidates cndt) {
		try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(cndt);
    		transaction.commit();
    		System.out.println("Candidate Details inserted successfully for Marketing.");
        } catch (Exception e) {
            e.printStackTrace();
        }
		finally {
			session.close();
		}
		return 1;
	}

	public void updateCandidates(Candidates cndt) {
		try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(cndt);
    		transaction.commit();
    		System.out.println("Candidate Details updated successfully for Marketing..");
        } catch (Exception e) {
            e.printStackTrace();
        }
		finally {
			session.close();
		}
	}

	public void deleteCandidates(Candidates cndt) {
		try (Session session = UtilityConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(cndt);
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
	public void displayCandidates(Candidates cndt) {
		
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
            Candidates cndt = session.get(Candidates.class, candidateID);
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