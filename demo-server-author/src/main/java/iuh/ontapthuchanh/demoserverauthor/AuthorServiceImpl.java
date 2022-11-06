package iuh.ontapthuchanh.demoserverauthor;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorRepository authorRepository;
	
	@Override
	public List<Author> findAll() {
		// TODO Auto-generated method stub
		return authorRepository.findAll();
	}

	@Override
	public Author findById(int maTim) {
		Optional<Author> result = authorRepository.findById(maTim);
		Author a = null;
		if (result.isPresent()) {
			a = result.get();
		}
		else {
			throw new RuntimeException("khong tim thay ma - " + maTim);
		}
		return a;
	}

	@Override
	public void save(Author author) {
		authorRepository.save(author);
	}

	@Override
	public void delete(int maXoa) {
		authorRepository.deleteById(maXoa);
	}

}
