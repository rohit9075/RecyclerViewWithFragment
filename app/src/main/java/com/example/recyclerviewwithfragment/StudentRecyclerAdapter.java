package com.example.recyclerviewwithfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StudentRecyclerAdapter  extends RecyclerView.Adapter<StudentRecyclerAdapter.StudentViewHolder> {

    Context context;
    List<Student> studentList;

    public StudentRecyclerAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.student_list, viewGroup, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {

        Student student = studentList.get(i);
        studentViewHolder.mTextViewStudentName.setText(student.getName());



    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{

        TextView mTextViewStudentName;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        mTextViewStudentName = itemView.findViewById(R.id.textView_name);

    }
}
}
