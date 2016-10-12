package com.june13u.votebattle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.JDOObjectNotFoundException;
import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.june13u.votebattle.mode.Stage;
import com.june13u.votebattle.util.PMF;

@SuppressWarnings("serial")
public class VotebattleServlet extends HttpServlet {
	@SuppressWarnings("unchecked")
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();

		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");

		String query = "select from " + Stage.class.getName();
		List<Stage> stageList = null;
		try {
			stageList = (List<Stage>) pm.newQuery(query).execute();
		} catch (JDOObjectNotFoundException e) {
			// 取得データなしの場合
			e.printStackTrace();
		} catch (Exception e){
			// テーブルが作成されていない場合(DBにデータ登録前)
			e.printStackTrace();
		}
		String res = "[";
		if (stageList != null) {
			for (Stage stage : stageList) {
				res += stage.toString();
			}
			res += ",";
		}
		res += "]";

		PrintWriter out = resp.getWriter();
		out.println(res);
		pm.close();
	}
}
