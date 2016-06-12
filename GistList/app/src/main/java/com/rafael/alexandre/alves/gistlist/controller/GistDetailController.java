package com.rafael.alexandre.alves.gistlist.controller;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.rafael.alexandre.alves.gistlist.model.Files;
import com.rafael.alexandre.alves.gistlist.model.Gist;
import com.rafael.alexandre.alves.gistlist.ui.detail.dialogFragments.content.ContentFragment;
import com.rafael.alexandre.alves.gistlist.ui.detail.dialogFragments.history.HistoryFragment;

import java.io.Serializable;

public class GistDetailController {

    public void openContentDialog(Gist fullGist, FragmentManager fragmentManager) {
        GistController gistController = new GistController();

        ContentFragment contentFragment = new ContentFragment();
        Bundle bundle = new Bundle();
        Files file = gistController.getFilesFromMap(fullGist.files);
        bundle.putString(Gist.CONTENT, file.content);
        contentFragment.setArguments(bundle);

        contentFragment.show(fragmentManager, Gist.CONTENT);
    }

    public void openHistoryDialog(Gist fullGist, FragmentManager fragmentManager) {
        HistoryFragment historyFragment = new HistoryFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Gist.HISTORY_LIST, (Serializable) fullGist.history);
        historyFragment.setArguments(bundle);

        historyFragment.show(fragmentManager, Gist.HISTORY);
    }
}