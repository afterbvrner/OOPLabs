package model.algorithm;

import model.cleaner.AbstractCleaner;
import model.repository.AbstractRepository;

import java.util.Arrays;
import java.util.List;

public class AllTriggerAlgorithm implements AbstractHybridCleaningAlgorithm {
    private final List<AbstractCleaner> cleaners;

    public AllTriggerAlgorithm(List<AbstractCleaner> cleaners) {
        this.cleaners = cleaners;
    }

    public AllTriggerAlgorithm(AbstractCleaner... cleaners) {
        this.cleaners = Arrays.asList(cleaners);
    }

    @Override
    public void clean(AbstractRepository repository) {
        if(cleaners.stream().allMatch(cleaner -> cleaner.isCleaningNeeded(repository)))
            cleaners.forEach(
                    cleaner -> cleaner.clean(repository)
            );
    }
}
