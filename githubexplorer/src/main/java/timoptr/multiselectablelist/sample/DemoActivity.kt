package timoptr.multiselectablelist.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_demo.*
import timoptr.multiselectablelist.sample.R
import timoptr.multiselectablelist.adapter.SelectableAdapter
import timoptr.multiselectablelist.sample.adapter.GithubAdapter
import timoptr.multiselectablelist.sample.repository.GithubRepositoryOverAPI
import timoptr.multiselectablelist.sample.viewmodel.DemoViewModel
import kotlin.coroutines.CoroutineContext



/**
 * @author Nibeaudeau Timothy <timothy.nibeaudeau@gmail.com>
 * @version 1.0
 * on 03/12/2017 for MultiSelectableRecycleListView with IntelliJ IDEA.
 */
class DemoActivity : AppCompatActivity() {

    private lateinit var viewModel: DemoViewModel
    private val subscriber = CompositeDisposable()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        viewModel = ViewModelProviders.of(this, DemoViewModel.Factory(GithubRepositoryOverAPI(subscriber))).get(DemoViewModel::class.java)
        initListMulti()
    }

    override fun onDestroy() {
        super.onDestroy()
        subscriber.clear()
    }


    private fun initListMulti() {
        val adapter = GithubAdapter(SelectableAdapter.Selection.MULTIPLE)
        listMulti.adapter = adapter
        listMulti.layoutManager = LinearLayoutManager(this)
        listMulti.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        viewModel.repositories.observe(this, Observer {
            adapter.submitList(it)
        })
    }
}