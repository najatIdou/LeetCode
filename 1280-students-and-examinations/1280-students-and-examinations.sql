# Write your MySQL query statement below
#SELECT distinct st.student_id, st.student_name, sb.subject_name, count(ex.subject_name) as attended_exams FROM Students as st , Subjects as sb JOIN Examinations as ex ON sb.subject_name=ex.subject_name WHERE st.student_id=ex.student_id GROUP BY st.student_id;

#SELECT st.student_id, st.student_name, sb.subject_name, (SELECT count(subject_name) FROM Examinations WHERE student=student) as attended_exams FROM Students st JOIN Subjects sb, Examinations Ex

#SELECT ex.student_id, st.student_name, ex.subject_name, count(*) as attended_exams FROM Examinations ex, Students st WHERE st.student_id=ex.student_id Group by ex.student_id,ex.subject_name ORDER BY ex.student_id,ex.subject_name;

SELECT st.student_id, st.student_name, sb.subject_name, count(ex.subject_name) as attended_exams FROM Students st CROSS JOIN Subjects sb LEFT JOIN Examinations ex ON ex.subject_name=sb.subject_name AND st.student_id=ex.student_id Group by st.student_id,sb.subject_name ORDER BY st.student_id,sb.subject_name;

