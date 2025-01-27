package visapps.mystankin.data.mj

import io.reactivex.Observable
import visapps.mystankin.domain.model.Mark
import visapps.mystankin.domain.model.Semester
import visapps.mystankin.domain.repository.MJRepository

class MJRepositoryImpl (val remote: MJRemoteDataSource,
                                           val local: MJLocalDataSource) : MJRepository {

    override fun getMarks(semester: Semester): Observable<List<Mark>> {
        // тут соединяем из бд и сети, сохраняем в бд если получили из сети
        return Observable.just(emptyList())
    }

    override fun getSemesters(): Observable<List<Semester>> {
        // тут соединяем из бд и сети, сохраняем в бд если получили из сети
        return Observable.just(emptyList())
    }
}