package visapps.mystankin.app.schedule.selectGroup

import androidx.lifecycle.LiveDataReactiveStreams
import io.reactivex.BackpressureStrategy
import io.reactivex.subjects.BehaviorSubject
import visapps.mystankin.app.base.StankinViewModel
import visapps.mystankin.domain.usecase.SearchGroupsUseCase
import javax.inject.Inject

class SelectGroupViewModel @Inject constructor(private val useCase: SearchGroupsUseCase): StankinViewModel() {

    private val querySubject = BehaviorSubject.create<String>()

    val groups = LiveDataReactiveStreams.fromPublisher(useCase(querySubject).toFlowable(BackpressureStrategy.LATEST))

    fun search(query: String) {
        querySubject.onNext(query)
    }

}