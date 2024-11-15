package com.example.pelican.info.service;

import com.example.pelican.info.dto.InfoRequest;
import com.example.pelican.info.entity.Info;
import com.example.pelican.info.repository.InfoRepository;
import com.example.pelican.user.entity.User;
import com.example.pelican.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InfoService {
    private final InfoRepository infoRepository;
    private final UserRepository userRepository;

    public void createInfo(Long userId, InfoRequest.createInfo req) {
        Optional<User> u = userRepository.findById(userId);
        User user = u.get();
        Info info = Info.from(req.getInfoType1(), req.getInfoType2(), req.getInfoHobby(),
                req.getWantType1(), req.getWantType2(), req.getWantHobby(), user);
        infoRepository.save(info);
    }

    public void updateInfo(Long userId, InfoRequest.PatchInfo req) {
        Optional<Info> infos = infoRepository.findById(req.getInfoId());
        Info info = infos.get();
        if (info.getUser().getId().equals(userId)) {
            info.setInfoType1(req.getInfoType1());
            info.setInfoType2(req.getInfoType2());
            info.setInfoHobby(req.getInfoHobby());
            info.setWantType1(req.getWantType1());
            info.setWantType2(req.getWantType2());
            info.setWantHobby(req.getWantHobby());

            infoRepository.save(info);

        }
    }


//    public boolean matchUser(Long userId1, Long userId2) {
//        Optional<Info> u1 = infoRepository.findById(userId1);
//        Optional<Info> u2 = infoRepository.findById(userId2);
//        boolean infoTypeMatch = u1.getInfoType1().equals(u2.getWantType1()) &&
//                u1.getWantType2().equals(u2.getInfoType2());
//
//        boolean hobbyMatch = u1.getInfoHobby().stream().anyMatch(u2.getInfoHobby()::contains);
//
//        return infoTypeMatch && hobbyMatch;
//    }
}
