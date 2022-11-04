package com.example.aston_rick_and_morty.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.aston_rick_and_morty.databinding.FragmentCharacterDetailBinding
import com.example.aston_rick_and_morty.api.models.Character
import dagger.hilt.android.AndroidEntryPoint

private const val FRAGMENT_EPISODE_DETAIL_TAG = "DETAIL_EPISODE_TAG"
private const val BACKSTACK_EPISODE_TAG = "backstack episode tag"
@AndroidEntryPoint
class CharacterDetailsFragment: Fragment() {
    private var _binding:FragmentCharacterDetailBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCharacterDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = arguments?.getParcelable<Character>(CHARACTER_DETAIL_ARG)

        binding.apply {
            if (args != null) {
                characterDetailIdTextview.text = args.id.toString()
                characterDetailNameTextview.text = args.name
                characterDetailStatusTextview.text = args.status
                characterDetailSpeciesTextview.text = args.species
                characterDetailTypeTextview.text = args.type
                characterDetailGenderTextview.text = args.gender
                characterDetailOriginTextview.text = args.origin.name
                characterDetailLocationTextview.text = args.location.name
                characterDetailUrlTextview.text = args.url
                characterDetailCreatedTextview.text = args.created

                val imageUrl = characterDetailImageview

                Glide
                    .with(imageUrl)
                    .load(args.image)
                    .into(characterDetailImageview)

            }
        }
    }

    companion object {
        private const val CHARACTER_DETAIL_ARG = "name"

        fun newInstance(character: Character) = CharacterDetailsFragment().apply {
            arguments = Bundle().apply {
                putParcelable(CHARACTER_DETAIL_ARG, character)
            }
        }
    }
}