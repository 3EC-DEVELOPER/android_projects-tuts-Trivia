package com.tec.tuts.trivia.data;

import com.tec.tuts.trivia.model.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinished(ArrayList<Question>questionArrayList);
}
