package com.example.legotestapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.legotestapp.QuizContract.*;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Quiz.db";
    private static final int DATABASE_VERSION = 1;




    private SQLiteDatabase db;

    public QuizDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " INTEGER, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionTable.COLUMN_OPTION5 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionTable() {
        Question q1 = new Question(1, "A", "B", "C", "D", "E", 1);
        addQuestion(q1);
        Question q2 = new Question(2, "A", "B", "C", "D", "E", 2);
        addQuestion(q2);
        Question q3 = new Question(3, "A", "B", "C", "D", "E", 1);
        addQuestion(q3);
        Question q4 = new Question(4, "A", "B", "C", "D", "E", 1);
        addQuestion(q4);
        Question q5 = new Question(5, "A", "B", "C", "D", "E", 1);
        addQuestion(q5);
        Question q6 = new Question(6, "A", "B", "C", "D", "E", 1);
        addQuestion(q6);
        Question q7 = new Question(7, "A", "B", "C", "D", "E", 1);
        addQuestion(q7);
        Question q8 = new Question(8, "A", "B", "C", "D", "E", 1);
        addQuestion(q8);
        Question q9 = new Question(9, "A", "B", "C", "D", "E", 1);
        addQuestion(q9);
        Question q10 = new Question(10, "A", "B", "C", "D", "E", 1);
        addQuestion(q10);
        Question q11 = new Question(11, "A", "B", "C", "D", "E", 1);
        addQuestion(q11);
        Question q12 = new Question(12, "A", "B", "C", "D", "E", 2);
        addQuestion(q12);
        Question q13 = new Question(13, "A", "B", "C", "D", "E", 1);
        addQuestion(q13);
        Question q14 = new Question(14, "A", "B", "C", "D", "E", 1);
        addQuestion(q14);
        Question q15 = new Question(15, "A", "B", "C", "D", "E", 1);
        addQuestion(q15);
        Question q16 = new Question(16, "A", "B", "C", "D", "E", 1);
        addQuestion(q16);
        Question q17 = new Question(17, "A", "B", "C", "D", "E", 2);
        addQuestion(q17);
        Question q18 = new Question(18, "A", "B", "C", "D", "E", 2);
        addQuestion(q18);
        Question q19 = new Question(19, "A", "B", "C", "D", "E", 1);
        addQuestion(q19);
        Question q20 = new Question(20, "A", "B", "C", "D", "E", 1);
        addQuestion(q20);
        Question q21 = new Question(21, "A", "B", "C", "D", "E", 2);
        addQuestion(q21);
        Question q22 = new Question(22, "A", "B", "C", "D", "E", 1);
        addQuestion(q22);
        Question q23 = new Question(23, "A", "B", "C", "D", "E", 2);
        addQuestion(q23);
        Question q24 = new Question(24, "A", "B", "C", "D", "E", 1);
        addQuestion(q24);
        Question q25 = new Question(25, "A", "B", "C", "D", "E", 4);
        addQuestion(q25);
        Question q26 = new Question(26, "A", "B", "C", "D", "E", 1);
        addQuestion(q26);
        Question q27 = new Question(27, "A", "B", "C", "D", "E", 1);
        addQuestion(q27);
        Question q28 = new Question(28, "A", "B", "C", "D", "E", 1);
        addQuestion(q28);
    }
    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuestionTable.COLUMN_OPTION5, question.getOption5());
        cv.put(QuestionTable.COLUMN_ANSWER_NR, question.getAnswerN());
        db.insert(QuestionTable.TABLE_NAME, null, cv);
    }

    public List<Question> getAllQuestion() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setOption5(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION5)));
                question.setAnswerN(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                questionList.add(question);

            }
            while (c.moveToNext());
        }
        c.close();
        return questionList;

    }
}
