package br.com.mj.alticci.domain.usecase;

import io.quarkus.cache.CacheResult;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciSequenceUsecase {

    @CacheResult(cacheName = "alticci-sequence")
    public Long call(Long number) {
        if (number <= 0) {
            return 0l;
        } else if (number == 1 || number == 2) {
            return 1l;
        }

        return call(number - 3) + call(number - 2);
    }

}
