package com.staffing;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.model.Candidates;
import com.model.Interviews;
import com.model.Jobs;

public class App {

    public static void main(String[] args) {
        // Load Hibernate configuration
        Configuration configuration = new Configuration().configure("Configuration.xml");

        // Create SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Create session
        Session session = sessionFactory.openSession();

        // Create transaction
        Transaction transaction = session.beginTransaction();

        try {
            // Create a new Candidate
            Candidates candidate = new Candidates();
            candidate.setName("John Doe");
            candidate.setEmail("john@example.com");
            candidate.setPhone("1234567890");
            candidate.setSkills("Java, Hibernate, Spring");
            candidate.setExperience(5);
            candidate.setResume("John's resume content");

            // Save the candidate to the database
            session.save(candidate);

            // Create a new Job
            Jobs job = new Jobs();
            job.setTitle("Software Engineer");
            job.setDescription("Develop software applications");
            job.setSkillsRequired("Java, Hibernate, Spring");
            job.setExperienceRequired(3);
            job.setSalaryRange("$60,000 - $80,000");
            job.setLocation("New York");
            job.setStatus("Open");

            // Save the job to the database
            session.save(job);

            // Create a new Interview
            Interviews interview = new Interviews();
            interview.setJobID(job.getJobID());
            interview.setInterviewer("Jane Smith");
            interview.setInterviewLocation("Remote");
            interview.setFeedback("Good");
            interview.setStatus("Completed");

            // Save the interview to the database
            session.save(interview);

            // Commit transaction
            transaction.commit();

            System.out.println("Candidate, Job, and Interview saved successfully!");
        } catch (Exception e) {
            // Rollback transaction if an error occurs
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close session and session factory
            session.close();
            sessionFactory.close();
        }
    }
}
